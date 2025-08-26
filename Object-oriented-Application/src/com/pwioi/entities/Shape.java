package com.pwioi.entities;

abstract public class Shape {
	public float area;
	public void disp() {
		System.out.println("The area of the above shape is : "+ area);
	}
	abstract public void acceptInput();
	abstract public void compute();
	
}
