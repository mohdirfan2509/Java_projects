package com.pwioi.entities;

public class Projects {
	private int pId;
	private String pName;
	private String pMgr;
	public Projects(int pId, String pName, String pMgr) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pMgr = pMgr;
	}
	public int getpId() {
		return pId;
	}
	public String getpName() {
		return pName;
	}
	public String getpMgr() {
		return pMgr;
	}
	
	

}
