package jp.co.internous.ecsite.model.entity;

import java.io.Serializable;

public class Cart implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String goodsName;
	private long price;
	private long count;
	
	//getter
	public long getId() {
		return id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public long getprice() {
		return price;
	}
	
	public long getCount() {
		return count;
	}
	
	//setter
	public void setId(long id) {
		this.id = id;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public void setCount(long count) {
		this.count = count;
	}
}
