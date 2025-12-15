// Write a java program using a predicate that return true 
// if number is positive and return false if number is false

package predicateProblems;
import java.util.function.Predicate;

public class CheckPositive {
	public static void main(String[] args) {
		
		    Predicate<Integer> p= i -> i>0;
		    
			System.out.println(p.test(10));
			System.out.println(p.test(-5)); 
			System.out.println(p.test(0));
	}
}
