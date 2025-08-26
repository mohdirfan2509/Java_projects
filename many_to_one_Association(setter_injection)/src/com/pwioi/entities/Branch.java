package com.pwioi.entities;

public class Branch {
	private int branchId;
	private String branchLoc ;
	public Branch(int branchId, String branchLoc) {
		super();
		this.branchId = branchId;
		this.branchLoc = branchLoc;
	}
	public int getBranchId() {
		return branchId ;
	}
	public String getBranchLoc() {
		return branchLoc;
	}
	
	
	

}
