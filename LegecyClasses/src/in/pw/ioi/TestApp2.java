
package in.pw.ioi;

import java.util.Enumeration;
import java.util.Stack;

public class TestApp2 {

	public static void main(String[] args) {
		Stack v= new Stack();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
	    System.out.println(v);
	    
	    Enumeration e= v.elements();
	    
	    while(e.hasMoreElements()==true) {
	    	       System.out.println(e.nextElement());
	    }
	}
}
