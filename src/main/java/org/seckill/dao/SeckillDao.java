package org.seckill.dao;

import java.util.List;
import org.seckill.entity.Seckill;

public interface SeckillDao {


  /**
   * 秒杀商品，减库存
   * @param seckillId
   * @param number
   */
  void reduceNumber(int seckillId,int number);


  /**
   * 秒杀商品详情
   * @param seckillId
   * @return
   */
  Seckill queryById(int seckillId);


  /**
   * 秒杀商品列表
   * @param page
   * @param offset
   * @return
   */
  List<Seckill> querySeckillList(int page,int offset);

}
