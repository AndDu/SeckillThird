package org.seckill.dao;

import javax.annotation.Resource;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SeckillSuccessd;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 配置spring和junit整合 Junit启动是加载springIOC容器 spring-test ，junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉spring junit配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillSuccessdDaoTest extends TestCase {


  @Resource
  private SeckillSuccessdDao seckillSuccessdDao;

  @Test
  public void testInsertSuccessKilled() {

    int i = seckillSuccessdDao.insertSuccessKilled(1000, "18511111111");
    System.out.println(i);

  }

  @Test
  public void testQueryByIdwithSeckill() {
    SeckillSuccessd seckillSuccessd = seckillSuccessdDao.queryByIdwithSeckill(1000,"18511111111");
    System.out.println(seckillSuccessd.toString());


  }
}