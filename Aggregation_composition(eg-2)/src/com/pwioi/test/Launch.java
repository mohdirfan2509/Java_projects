package com.pwioi.test;
import com.pwioi.aggregate_entities.*;
import com.pwioi.main_entities.*;

public class Launch {
	public static void main(String[] args) {
		Bike bk1=new Bike();
		Book bok1=new Book();
		Student s1= new Student("Irfan", 25,bk1,bok1);
		
		
		
		
		System.out.println(s1.h1.getHeartBeat());
		System.out.println(s1.h1.getWeight());
		System.out.println(s1.brain1.getBrainWeight());
		System.out.println(s1.brain1.getColour());
		
		
		System.out.println(s1.bike1.getBikeBrand());
		System.out.println(s1.bike1.getMileage());
		System.out.println(s1.book1.getAuthor());
		System.out.println(s1.book1.getTitle());
//		s1=null;
		System.out.println(s1.h1.getHeartBeat());
		System.out.println(s1.h1.getWeight());
		System.out.println(s1.brain1.getBrainWeight());
		System.out.println(s1.brain1.getColour());
		
		
		System.out.println(s1.bike1.getBikeBrand());
		System.out.println(s1.bike1.getMileage());
		System.out.println(s1.book1.getAuthor());
		System.out.println(s1.book1.getTitle());
		
		
		
		
	}

}
