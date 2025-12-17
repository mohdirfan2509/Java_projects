package com.pw.ioi;

public class Queue {
	private int x=0;
	public void put(int j) {
		x=j;
		System.out.println("I have produced !! "+x);
	}
	public void get() {
		System.out.println("I have consumed !! "+ x);
	}

}
