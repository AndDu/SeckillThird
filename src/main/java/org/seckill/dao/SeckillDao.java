package org.seckill.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

public interface SeckillDao {


  /**
   * 秒杀商品，减库存
   * @param seckillId
   * @param killTime
   * @return  影响行数，大于1表示更新成功
   */
  int reduceNumber(@Param("seckillId") int seckillId, @Param("killTime")Date killTime);


  /**
   * 秒杀商品详情
   * @param seckillId
   * @return
   */
  Seckill queryById(long seckillId);


  /**
   * 秒杀商品列表
   * @param offset
   * @param limit
   * @return
   */
  List<Seckill> querySeckillList(@Param("offset")int offset,@Param("limit")int limit);

}
