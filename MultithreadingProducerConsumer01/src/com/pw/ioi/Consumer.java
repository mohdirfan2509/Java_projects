package com.pw.ioi;

public class Consumer extends Thread {
	
	private Queue q;

	public Consumer(Queue q) {
		super();
		this.q = q;
	}
	
    public void run() {
    	
    	   while(true) {
    		   q.get();
    	   }
    	
    }

}
