package com.kfit;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Demo {
	private int id;
//	@JSONField(serialize = false)
	private String name;
//	@JSONField(format="yyyy-MM-dd HH:mm")
	private Date date;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
