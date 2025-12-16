package com.pw.ioi.test;

import com.pw.ioi.Demo1;
import com.pw.ioi.Demo2;
import com.pw.ioi.Demo3;

public class TestApp {
	public static void main(String[] args) {
		Demo1 d1= new Demo1();
		Demo2 d2= new Demo2();
		Demo3 d3= new Demo3();
		
		d1.start();
		d2.start();
		d3.start();
	}

}
