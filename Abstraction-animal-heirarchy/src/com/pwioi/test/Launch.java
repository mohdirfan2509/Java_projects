package com.pwioi.test;

import com.pwioi.entities.Deer;
import com.pwioi.entities.Monkey;
import com.pwioi.entities.Tiger;

public class Launch {
	public static void main(String[] args) {
		Deer d=new Deer();
		Tiger t=new Tiger();
		Monkey m=new Monkey();
//		Animal a;
		Forest f=new Forest();
		
		f.permit(d);
		f.permit(t);
		f.permit(m);
		
		
	}
}
