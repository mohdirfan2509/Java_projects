package com.pwioi.entities;

import java.util.Scanner;

public class Square extends Shape {
	private float length;
	public void acceptInput() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length of square :");
		length =scan.nextFloat();
	}
	public void compute() {
		area=length*length;
	}
	

}
