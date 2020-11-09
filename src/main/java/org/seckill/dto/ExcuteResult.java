package org.seckill.dto;

import org.seckill.entity.Seckill;

public class ExcuteResult {


  private long seckillId;
  private int state;
  private Seckill seckill;


  public ExcuteResult(long seckillId, int state, Seckill seckill) {
    this.seckillId = seckillId;
    this.state = state;
    this.seckill = seckill;
  }

  public long getSeckillId() {
    return seckillId;
  }

  public void setSeckillId(long seckillId) {
    this.seckillId = seckillId;
  }

  public int getState() {
    return state;
  }

  public void setState(int state) {
    this.state = state;
  }

  public Seckill getSeckill() {
    return seckill;
  }

  public void setSeckill(Seckill seckill) {
    this.seckill = seckill;
  }
}
