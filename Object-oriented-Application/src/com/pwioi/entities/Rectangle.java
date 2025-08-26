package com.pwioi.entities;

import java.util.Scanner;

public class Rectangle extends Shape {
	private float length;
	private float breadth;
	public void acceptInput() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the length of Rectangle :");
		length =scan.nextFloat();
		System.out.println("Enter the breadth of Rectangle :");
		breadth =scan.nextFloat();
	}
	public void compute() {
		area=length*breadth;
	}
	

}