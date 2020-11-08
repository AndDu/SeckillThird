package org.seckill.service;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.seckill.dao.SeckillDao;
import org.seckill.dao.SeckillSuccessdDao;
import org.seckill.dto.ExcuteResult;
import org.seckill.dto.SeckillState;
import org.seckill.entity.Seckill;

public class SeckillServiceImp implements ISeckillService {


  public static final String KEY = "sgregrewgrewgrwgrwesafgd";
  @Resource
  private SeckillDao seckillDao;

  @Resource
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
    return s;

  }

  @Override
  public ExcuteResult excuteSeckill(long seckillId, String userPhone, String md5) {
    return null;
  }
}
