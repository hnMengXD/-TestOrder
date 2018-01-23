package com.meng.model;

public class Time {
	private int tid;
	private String tname;
	@Override
	public String toString() {
		return "Time [tid=" + tid + ", tname=" + tname + "]";
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
}
