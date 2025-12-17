package com.pw.ioi;

public class Consumer extends Thread {
	
	private Queue q;

	public Consumer(Queue q) {
		super();
		this.q = q;
	}
	
    public void run() {
    	
    	   while(true) {
    		   try {
				q.get();
				Thread.sleep(5000);
			   } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			   }
    	   }
    	
    }

}
