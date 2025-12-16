package com.pw.ioi;

public class Demo3 extends Thread {
	
	public void run() {
//		Printing Activity
		System.out.println("Printing Activity Started !!");
		for(int i=65 ; i<69;i++) {
			System.out.println((char) i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing Activity Completed !!");
	}

}
