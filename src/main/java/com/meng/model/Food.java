package com.meng.model;

public class Food {
	private int fid;
	private String fname;
	@Override
	public String toString() {
		return "Food [fid=" + fid + ", fname=" + fname + "]";
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
}
