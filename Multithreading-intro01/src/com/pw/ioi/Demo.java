package com.pw.ioi;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
//		Banking activity
		Scanner scan= new Scanner(System.in);
		System.out.println("Banking Activity Started !!");
		System.out.println("Enter the Account number !!");
		int acc_no=scan.nextInt();
		System.out.println("Enter the Password !!");
		int password=scan.nextInt();
		Thread.sleep(5000);
		System.out.println("Collect Your Cash !!");
		System.out.println("Banking Activity Completed !!");
		
//		Addition Activity
		System.out.println("Addition Activity Started !!");
		int num1=433;
		int num2=431;
		Thread.sleep(2000);
		int res=num1+num2;
		System.out.println(res);
		System.out.println("Addition Activity Completed !!");
		
//		Printing Activity
		System.out.println("Printing Activity Started !!");
		for(int i=65 ; i<69;i++) {
			System.out.println((char) i);
			Thread.sleep(2000);
		}
		System.out.println("Printing Activity Completed !!");
	}

}
