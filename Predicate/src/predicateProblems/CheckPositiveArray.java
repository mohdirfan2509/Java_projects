// Write a java program using predicate that takes array as input and 
// returns true if all elements are true, else returns false.
package predicateProblems;
import java.util.function.*;

public class CheckPositiveArray {
	public static void main(String[] args) {
	    Predicate<int []> p= arr -> {
	                          for(int i :arr){
	                        	    if(i<0) return false;
	                        	 }
	                          return true;
	                       };
	    
	    int a []={2,3,4,-3,5};
	    
		System.out.println(p.test(a));
	}

}
