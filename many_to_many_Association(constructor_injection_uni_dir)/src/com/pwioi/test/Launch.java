package com.pwioi.test;
import com.pwioi.entities.*;


public class Launch {
	public static void main(String[] args) {
		Projects pj1=new Projects(125,"GmailApp","Irfan");
		Projects pj2=new Projects(126,"GmapApp","Munaf");
		Projects pj3=new Projects(127,"GphotosApp","Rakesh");
		
		Employee e1= new Employee(210,"Monu",pj1,pj2);
		Employee e2= new Employee(211,"Sonu",pj2,pj3);
		Employee e3= new Employee(212,"Banu",pj1,pj2,pj3);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	
	}

	

}