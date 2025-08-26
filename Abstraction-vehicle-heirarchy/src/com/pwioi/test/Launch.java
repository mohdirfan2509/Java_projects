package com.pwioi.test;
import com.pwioi.entities.*;


public class Launch {
	public static void main(String[] args) {
		Maruti800 mar=new Maruti800();
		Innova inn=new Innova();
		Ferrari fer= new Ferrari();

		Road ro =new Road();
		
		ro.permit(mar);
		ro.permit(inn);
		ro.permit(fer);
		
		
	}
}
