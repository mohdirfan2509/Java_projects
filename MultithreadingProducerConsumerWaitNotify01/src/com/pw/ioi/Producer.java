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
			q.put(i++);
		}
	}

}
