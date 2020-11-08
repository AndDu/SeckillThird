package org.seckill.dao;

import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 配置spring和junit整合 Junit启动是加载springIOC容器 spring-test ，junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉spring junit配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest extends TestCase {


  @Resource
  private SeckillDao seckillDao;

  @Test
  public void testReduceNumber() {
    int i = seckillDao.reduceNumber(1000, new Date());
    System.out.println(i);
  }

  @Test
  public void testQueryById() {
    Seckill seckill = seckillDao.queryById(1000);
    System.out.println(seckill.toString());
  }

  @Test
  public void testQuerySeckillList() {
    List<Seckill> seckills = seckillDao.querySeckillList(1, 10);
    System.out.println(seckills.size());
  }
}