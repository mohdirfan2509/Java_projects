package com.pw.ioi.test;

import com.pw.ioi.Consumer;
import com.pw.ioi.Producer;
import com.pw.ioi.Queue;

public class Test {
	public static void main(String[] args) {
		
		Queue q=new Queue();
		Producer pr=new Producer(q);
		Consumer cr= new Consumer(q);
		pr.start();
		cr.start();
	
	}

}
