package com.pw.ioi;

import java.util.ArrayList;

public class Launch {
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(40);
		
		al.forEach(x->System.out.println(x%2==0));
	}
	

	
	

}
