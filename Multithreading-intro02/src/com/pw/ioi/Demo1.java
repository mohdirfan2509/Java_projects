package com.pw.ioi;

import java.util.Scanner;

public class Demo1 extends Thread {
	
//	Banking activity
	public void run() {
		Scanner scan= new Scanner(System.in);
		System.out.println("Banking Activity Started !!");
		System.out.println("Enter the Account number !!");
		int acc_no=scan.nextInt();
		System.out.println("Enter the Password !!");
		int password=scan.nextInt();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Collect Your Cash !!");
		System.out.println("Banking Activity Completed !!");
		scan.close();
	}
	

}
