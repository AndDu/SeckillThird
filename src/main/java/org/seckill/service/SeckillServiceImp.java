package org.seckill.service;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.seckill.dao.SeckillDao;
import org.seckill.dao.SeckillSuccessdDao;
import org.seckill.dto.ExcuteResult;
import org.seckill.dto.SeckillState;
import org.seckill.entity.Seckill;
import org.seckill.entity.SeckillSuccessd;
import org.seckill.exception.RepeatSeckillException;
import org.seckill.exception.SeckillCloseExcetion;
import org.seckill.exception.SeckillException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

public class SeckillServiceImp implements ISeckillService {


  public static final String KEY = "sgregrewgrewgrwgrwesafgd";
  @Autowired
  private SeckillDao seckillDao;

  @Autowired
  private SeckillSuccessdDao seckillSuccessdDao;

  @Override
  public List<Seckill> getAllSeckillList(int offset, int limit) {
    return seckillDao.querySeckillList(offset,limit);
  }

  @Override
  public Seckill getSeckillById(long seckillId) {
    return seckillDao.queryById(seckillId);
  }

  @Override

  public SeckillState getSeckillState(long seckillId) {

    Seckill seckill = seckillDao.queryById(seckillId);
    if (seckill == null) {
      return new SeckillState(seckillId,false);
    }

    Date date = new Date();
    if (seckill.getStartTime().getTime()<date.getTime() || date.getTime()>seckill.getEndTime().getTime())
      return new SeckillState(seckillId,false);

    SeckillState seckillState = new SeckillState(seckillId, true, getMd5(seckillId));
    seckillState.setStartTime(seckill.getStartTime());
    seckillState.setEndTime(seckill.getEndTime());
    return seckillState;
  }

  private String getMd5(long seckillId) {
    String s = seckillId + '/' + KEY;
    String md5 = new String(DigestUtils.md5Digest(s.getBytes()));
    return md5;

  }

  @Override
  @Transactional
  public ExcuteResult excuteSeckill(long seckillId, String userPhone, String md5) {

    try {
      if(md5==null || !md5.equals(getMd5(seckillId))){
        throw new SeckillException("秒杀md5被篡改");
      }
      int number= seckillDao.reduceNumber(seckillId, new Date());

      if (number<=0){
        throw new SeckillCloseExcetion("秒杀失败,过期或xxx");
      }else {
        int i = seckillSuccessdDao.insertSuccessKilled(seckillId, userPhone);
        if (i>0){
          SeckillSuccessd seckillSuccessd = seckillSuccessdDao
              .queryByIdwithSeckill(seckillId, userPhone);
          return new ExcuteResult(seckillId,0,seckillSuccessd.getSeckill());
        }else {
          throw new RepeatSeckillException("重复秒杀异常");
        }
      }
    } catch (SeckillException e) {
     throw e;
    } catch (SeckillCloseExcetion seckillCloseExcetion) {
      throw seckillCloseExcetion;
    } catch (RepeatSeckillException e) {
      throw e;
    }catch (Exception e){
      throw new RuntimeException("内部未知异常");
    }

  }
}
