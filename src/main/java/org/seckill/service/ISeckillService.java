package org.seckill.service;

import java.util.List;
import org.seckill.dto.ExcuteResult;
import org.seckill.dto.SeckillState;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatSeckillException;
import org.seckill.exception.SeckillCloseExcetion;
import org.seckill.exception.SeckillException;

public interface ISeckillService {

  /**
   * 获取所有的秒杀列表
   * @return
   */
  List<Seckill> getAllSeckillList(int offset,int limit);


  /**
   * 获取单个商品的秒杀列表
   * @param seckillId
   * @return
   */
  Seckill getSeckillById(long seckillId);


  /**
   * 获取秒杀执行接口
   * @param seckillId
   * @return
   */
  SeckillState getSeckillState(long seckillId);


  /**
   * 执行秒杀接口
   * @param seckillId
   * @param userPhone
   * @param md5
   * @return
   */
  ExcuteResult excuteSeckill(long seckillId,String userPhone,String md5) throws RepeatSeckillException, SeckillCloseExcetion, SeckillException;


}
