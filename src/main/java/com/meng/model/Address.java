package com.meng.model;

public class Address {
	private int aid;
	private String aname;
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aname=" + aname + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	
}
