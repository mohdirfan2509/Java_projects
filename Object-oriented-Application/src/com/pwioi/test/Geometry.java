package com.pwioi.test;
import com.pwioi.entities.*;

public class Geometry {
	public void permit(Shape s) {
		s.acceptInput();
		s.compute();
		s.disp();
	}

}
