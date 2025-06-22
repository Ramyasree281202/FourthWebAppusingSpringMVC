package com.java.ThirdWebAppusingSpringMVC.controller;

public class Course {
	private Integer cid;
	private String cname;
	private Integer cprice;
	public Course(Integer cid, String cname, Integer cprice) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getCprice() {
		return cprice;
	}
	public void setCprice(Integer cprice) {
		this.cprice = cprice;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
}
