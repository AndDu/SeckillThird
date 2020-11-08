package org.seckill.dto;

import java.util.Date;

public class SeckillState {

  private long seckillId;
  private boolean isStart;
  private String md5;
  private Date startTime;
  private Date endTime;

  public SeckillState(long seckillId, boolean isStart, String md5) {
    this.seckillId = seckillId;
    this.isStart = isStart;
    this.md5 = md5;
  }


  public SeckillState(long seckillId, boolean isStart) {
    this.seckillId = seckillId;
    this.isStart = isStart;
  }

  public long getSeckillId() {
    return seckillId;
  }

  public void setSeckillId(long seckillId) {
    this.seckillId = seckillId;
  }

  public boolean isStart() {
    return isStart;
  }

  public void setStart(boolean start) {
    isStart = start;
  }

  public String getMd5() {
    return md5;
  }

  public void setMd5(String md5) {
    this.md5 = md5;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }
}
