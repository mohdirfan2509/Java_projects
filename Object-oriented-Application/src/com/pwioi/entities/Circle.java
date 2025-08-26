package com.pwioi.entities;

import java.util.Scanner;

public class Circle extends Shape {
	private float radius;
	
	public void acceptInput() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the radius of circle :");
		radius =scan.nextFloat();
	}
	public void compute() {
		area=3.14f*radius*radius;
	}
	

}