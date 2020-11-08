package org.seckill.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;
import org.seckill.entity.SeckillSuccessd;
import org.seckill.entity.Successd;

public interface SeckillSuccessdDao {


  int insertSuccessKilled(@Param("seckillId") int seckillId,@Param("phone")String phone);

  SeckillSuccessd queryByIdwithSeckill(@Param("seckillId")long seckillId,@Param("phone")String phone);

//  Successd excuteSeckill(int seckillId,int number,String phone);

//  SeckillSuccessd querySeckillSuceessByPhone(String phone);
//
//  List<SeckillSuccessd> queryAllSeckillSuceessByPhone(String phone);

}
