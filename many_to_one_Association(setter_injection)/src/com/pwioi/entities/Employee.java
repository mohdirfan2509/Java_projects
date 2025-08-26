package com.pwioi.entities;

public class Employee {
	private int empId;
	private String empName;
	private Branch b;

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setB(Branch b) {
		this.b = b;
	}

	
	public String toString() {
		String str="empId: "+empId+"\n"+"empName:"+empName+"\n"
	+"branchId: "+b.getBranchId()+"\n"+"branchLoc:"+b.getBranchLoc()+"\n";
		return str ;
	}

	
	
	

}

