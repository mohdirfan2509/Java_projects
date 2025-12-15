package predicateProblems;
import java.util.function.*;
public class PredicateChaining {
public static void main(String[] args) {
		
		Predicate<Integer> isPositive = i-> i>0; 
		Predicate<Integer> isEven = i-> i%2==0; 
				int arr[]={-5,0,5,10,-12,25,30,-100};
				check(isPositive,arr);
				check(isEven,arr);
				check(isPositive.negate(),arr);
				check(isEven.negate(),arr);
				check(isPositive.and(isEven),arr);
				check(isPositive.or(isEven),arr);			
	}
 static void check(Predicate<Integer> p,int a[]) {
	 for(int i:a) {
		 if(p.test(i)){
			 System.out.print(i+" "); 
		 }
	 }
	 System.out.println();
	 
 }

}
