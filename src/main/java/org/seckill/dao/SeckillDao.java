package org.seckill.dao;

import java.util.Date;
import java.util.List;
import org.seckill.entity.Seckill;

public interface SeckillDao {


  /**
   * 秒杀商品，减库存
   * @param seckillId
   * @param killTIme
   * @return  影响行数，大于1表示更新成功
   */
  int reduceNumber(int seckillId, Date killTIme);


  /**
   * 秒杀商品详情
   * @param seckillId
   * @return
   */
  Seckill queryById(int seckillId);


  /**
   * 秒杀商品列表
   * @param offset
   * @param limit
   * @return
   */
  List<Seckill> querySeckillList(int offset,int limit);

}
