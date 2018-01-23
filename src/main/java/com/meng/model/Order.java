package com.meng.model;

import java.util.List;

public class Order {
	private int oid;
	private String oname;
	private String tel;
	private String datea;
	private Time time;
	private Address address;
	private List<Food> foodlist;
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", tel=" + tel + ", datea=" + datea + ", time=" + time
				+ ", address=" + address + ", foodlist=" + foodlist + "]";
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getDatea() {
		return datea;
	}
	public void setDatea(String datea) {
		this.datea = datea;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Food> getFoodlist() {
		return foodlist;
	}
	public void setFoodlist(List<Food> foodlist) {
		this.foodlist = foodlist;
	}
	
	
	
}
