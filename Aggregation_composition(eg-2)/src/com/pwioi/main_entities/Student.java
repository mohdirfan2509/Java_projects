package com.pwioi.main_entities;
import com.pwioi.composite_entities.*;
import com.pwioi.aggregate_entities.*;

public class Student {
	private String name;
	private int rollNo;
	public Heart h1=new Heart(75,65);
	public Brain brain1=new Brain("grey",65);
    public Bike bike1;
	public Book book1;
	public Student(String name, int rollNo,Bike bike1, Book book1) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		
		
		this.bike1 = bike1;
		this.book1 = book1;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public Heart getH1() {
		return h1;
	}
	public Brain getBrain1() {
		return brain1;
	}
	public Bike getBike1() {
		return bike1;
	}
	public Book getBook1() {
		return book1;
	}
	
	

}
