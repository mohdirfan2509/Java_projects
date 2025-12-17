package com.pw.ioi;

public class Astras implements Runnable {
	
	String res1= new String("BRAHMASTRA"); 
	String res2= new String("SARPASTRA"); 
	String res3= new String("PASHUPATASTRA"); 
	
	public void run() {
		Thread t= Thread.currentThread();
		String name= t.getName();
		if(name.equals("RAMA")) {
			ramaAcqResources();
		}else {
			ravanaAcqResources();
		}
	}

	private void ramaAcqResources() {

			try { 
				   synchronized (res1) {
					  System.out.println("rama has acquired "+ res1);
					  Thread.sleep(2000);
					  synchronized (res2) {
						  System.out.println("rama has acquired "+ res2);
						  Thread.sleep(2000);
						  synchronized (res3) {
							  System.out.println("rama has acquired "+ res3);
							  Thread.sleep(2000);
						}
					}
				}
			} catch (InterruptedException e) {
				System.out.println("Rama interrupted");
			}
		}
	
	private void ravanaAcqResources() {

		try { 
			   synchronized (res3) {
				  System.out.println("ravana has acquired "+ res3);
				  Thread.sleep(2000);
				  synchronized (res2) {
					  System.out.println("ravana has acquired "+ res2);
					  Thread.sleep(2000);
					  synchronized (res1) {
						  System.out.println("ravana has acquired "+ res1);
						  Thread.sleep(2000);
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("ravana interrupted");
		}
	}

	
	

}
