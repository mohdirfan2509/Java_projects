package com.pw.ioi.test;

import com.pw.ioi.Astras;

public class Ramayana {
	public static void main(String[] args) {
		Astras ast=new Astras();
		
		Thread t1= new Thread(ast);
		Thread t2= new Thread(ast);
		t1.setName("RAMA");
		t2.setName("RAVANA");
		
		t1.start();
		t2.start();
	}

}
