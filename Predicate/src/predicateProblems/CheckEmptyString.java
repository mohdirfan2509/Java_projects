// Write a java program using Predicate that returns True if String 
// is non-empty and returns false if String is empty.
package predicateProblems;
import java.util.function.*;

public class CheckEmptyString {
	public static void main(String[] args) {
		
			Predicate<String> p2= s -> s.length()>0;
			
			System.out.println(p2.test("hello pw"));
			System.out.println(p2.test(""));
			System.out.println(p2.test("irfan"));
	}

}
 