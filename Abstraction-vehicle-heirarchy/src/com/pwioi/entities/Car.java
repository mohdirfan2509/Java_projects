package com.pwioi.entities;

abstract public class Car {
	public void start() {
		System.out.println("Car is starting");
	}
	public void stop() {
		System.out.println("Car is stopping");
	}
	abstract public void accelerate();
	abstract public void drive();
	abstract public void combustion();
	

}
