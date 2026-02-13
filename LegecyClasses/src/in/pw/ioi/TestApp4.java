
package in.pw.ioi;

import java.util.Enumeration;
import java.util.Properties;

public class TestApp4 {

	public static void main(String[] args) {
		Properties v= new Properties();
		
		v.put("Apples", 10);
		v.put("Bananas", 20);
		v.put("Mangoes", 30);
		v.put("Guava", 40);
		v.put("Pineapple", 50);
	    System.out.println(v);
	    
	    Enumeration e= v.elements();
	    
	    while(e.hasMoreElements()==true) {
	    	       System.out.println(e.nextElement());
	    }
	}
}
