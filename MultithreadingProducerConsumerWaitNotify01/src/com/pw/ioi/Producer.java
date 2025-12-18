package com.pw.ioi;

public class Producer extends Thread {
	
	private Queue q;

	public Producer(Queue q) {
		super();
		this.q = q;
	}

	public void run() {
		int i=1;
		while(true) {
			try {
				q.put(i++);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
