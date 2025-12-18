package com.pw.ioi;

public class Queue {
	private int x=0;
	boolean value_present_in_x=false;
	public synchronized void put(int j) throws InterruptedException {
		
		
		if(value_present_in_x==true) {
			wait();
		}else {
			x=j;
			System.out.println("I have produced !! "+x);
			value_present_in_x=true;
			notify();
		}
		
	}
	public synchronized void get() throws InterruptedException {
		if(value_present_in_x==false) {
			wait();
		}else {
			
			System.out.println("I have consumed !! "+x);
			value_present_in_x=false;
			notify();
		}
		
	      
	}

}
