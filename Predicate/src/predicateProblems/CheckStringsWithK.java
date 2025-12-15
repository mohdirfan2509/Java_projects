// Write a java program using predicate that takes string as input and returns true 
// if if starts with 'K' else returns false
package predicateProblems;
import java.util.function.*;

public class CheckStringsWithK {
	public static void main(String[] args) {
	    Predicate<String> p = s -> s.startsWith("k");
	    
	    String arr []={"hello", "kaibalya", "kamlesh","munaf","irfan","kumar","kashif"};
		for(String i:arr){
		    if(p.test(i)){
		        System.out.println(i);
		    }
		}
	}

}
