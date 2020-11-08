package org.seckill.entity;

import java.io.Serializable;
import java.util.Date;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description  
 * @Author  huangjinfu
 * @Date 2020-11-05 
 */



public class Seckill  implements Serializable {

	private static final long serialVersionUID =  817040863508521897L;


	@Override
	public String toString() {
		return "Seckill{" +
				"seckillId=" + seckillId +
				", name='" + name + '\'' +
				", number=" + number +
				", startTime=" + startTime +
				", endTime=" + endTime +
				", createTime=" + createTime +
				'}';
	}

	/**
	 * 商品ID
	 */
	private Long seckillId;

	/**
	 * 秒杀商品名
	 */
	private String name;

	/**
	 * 秒杀库存数量
	 */
	private Long number;

	/**
	 * 秒杀开始时间
	 */
	private Date startTime;

	/**
	 * 秒杀结束时间
	 */
	private Date endTime;

	/**
	 * 创建时间
	 */
	private Date createTime;

	public Long getSeckillId() {
		return this.seckillId;
	}

	public void setSeckillId(Long seckillId) {
		this.seckillId = seckillId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return this.number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
