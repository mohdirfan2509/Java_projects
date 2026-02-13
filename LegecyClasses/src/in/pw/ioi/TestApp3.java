
package in.pw.ioi;

import java.util.Enumeration;
import java.util.Hashtable;

public class TestApp3 {

	public static void main(String[] args) {
		Hashtable v= new Hashtable();
		
		v.put("Apples", 10);
		v.put("Bananas", 20);
		v.put("Mangoes", 30);
		v.put("Guava", 40);
		v.put("Pineapple", 50);
	    System.out.println(v);
	    
	    Enumeration keys= v.keys();
	    Enumeration values= v.elements();
	    
	    while(keys.hasMoreElements()==true) {
	    	       System.out.println(keys.nextElement());
	    	       System.out.println(values.nextElement());
	    }
	}
}
