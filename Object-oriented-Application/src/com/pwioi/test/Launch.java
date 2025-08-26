package com.pwioi.test;

import com.pwioi.entities.*;

public class Launch {
	public static void main(String[] args) {
		Square sq=new Square();
		Rectangle rec=new Rectangle();
		Circle cir=new Circle();
		Geometry geo= new Geometry();
		geo.permit(sq);
		geo.permit(rec);
		geo.permit(cir);
	}
	

	

}
