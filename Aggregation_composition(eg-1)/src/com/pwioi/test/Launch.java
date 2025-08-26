package com.pwioi.test;
import com.pwioi.entities.*;

public class Launch {
	public static void main(String[] args) {
		
		Charger ch1=new Charger();
		Mobile mob1=new Mobile("snapDragon",5000,ch1);
		
		
		System.out.println(mob1);
		System.out.println(mob1.os.getOsname());
		System.out.println(mob1.os.getOsSize());
		System.out.println(mob1.getChr().getChrBrand());
		System.out.println(mob1.getChr().getChrvoltage());
//		mob1=null;
		System.out.println(mob1.os.getOsname());
		System.out.println(mob1);
		System.out.println(mob1.os.getOsname());
		System.out.println(mob1.os.getOsSize());
		System.out.println(mob1.getChr().getChrBrand());
		System.out.println(mob1.getChr().getChrvoltage());
	
	}

}
