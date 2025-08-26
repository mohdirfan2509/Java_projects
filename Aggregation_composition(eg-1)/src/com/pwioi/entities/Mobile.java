package com.pwioi.entities;
//import com.pwioi.*;

public class Mobile {
	private String proccessor;
	private int price;
	public OperatingSystem os=new OperatingSystem("2gb","android");
	public Charger chr;
	public Mobile(String proccessor, int price, Charger chr) {
		super();
		this.proccessor = proccessor;
		this.price = price;
		
		this.chr = chr;
	}
	public String getProccessor() {
		return proccessor;
	}
	public int getPrice() {
		return price;
	}
	public OperatingSystem getOs() {
		return os;
	}
	public Charger getChr() {
		return chr;
	}
	
	

}
