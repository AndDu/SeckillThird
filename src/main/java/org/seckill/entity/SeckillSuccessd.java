package org.seckill.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  huangjinfu
 * @Date 2020-11-05 
 */


public class SeckillSuccessd  implements Serializable {


	@Override
	public String toString() {
		return "SeckillSuccessd{" +
				"seckill=" + seckill +
				", seckillId=" + seckillId +
				", userPhone='" + userPhone + '\'' +
				", createTime=" + createTime +
				", state=" + state +
				'}';
	}

	private static final long serialVersionUID =  4470355504677089577L;

	private Seckill seckill;

	public Seckill getSeckill() {
		return seckill;
	}

	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	}

	/**
	 * 商品ID
	 */
	private Long seckillId;

	/**
	 * 秒杀用户手机
	 */
	private String userPhone;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 秒杀状态，-1 0 1 ： 失败，成功， 已付款
	 */
	private Integer state;

	public Long getSeckillId() {
		return this.seckillId;
	}

	public void setSeckillId(Long seckillId) {
		this.seckillId = seckillId;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}
