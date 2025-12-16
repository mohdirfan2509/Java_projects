package com.pw.ioi;

public class Demo2 extends Thread {
	
//	Banking activity
	public void run() {
//		Addition Activity
		System.out.println("Addition Activity Started !!");
		int num1=433;
		int num2=431;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int res=num1+num2;
		System.out.println(res);
		System.out.println("Addition Activity Completed !!");
	}

}
