// Write a java program using predicate that takes a string input
// stores the non-empty string in an new ArrayList
package predicateProblems;
import java.util.ArrayList;
import java.util.function.*;

public class RemoveEmptyStrings {
	public static void main(String[] args) {
	    Predicate<String> p = str -> str!=null && str.length() !=0;
	    String s1 []= {"Lead","","Transform", null, "Innovate"};
	    ArrayList<String> al=new ArrayList<String>();
	    for(String elem:s1){
	    	   if(p.test(elem)) {
	    		   al.add(elem);
	    	   } 
	    }
	    System.out.println(al);
	}
}
