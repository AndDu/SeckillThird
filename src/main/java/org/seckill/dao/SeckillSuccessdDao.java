package org.seckill.dao;

import java.util.List;
import org.seckill.entity.Seckill;
import org.seckill.entity.SeckillSuccessd;
import org.seckill.entity.Successd;

public interface SeckillSuccessdDao {



  Successd excuteSeckill(int seckillId,int number,String phone);

  SeckillSuccessd querySeckillSuceessByPhone(String phone);

  List<SeckillSuccessd> queryAllSeckillSuceessByPhone(String phone);

}
