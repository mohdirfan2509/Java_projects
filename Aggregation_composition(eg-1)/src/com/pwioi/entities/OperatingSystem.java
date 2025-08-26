package com.pwioi.entities;

public class OperatingSystem {
	private String OsSize;
	private String Osname;
	public OperatingSystem(String osSize, String osname) {
		super();
		OsSize = osSize;
		Osname = osname;
	}
	public String getOsSize() {
		return OsSize;
	}
	public String getOsname() {
		return Osname;
	}
	
	

}
