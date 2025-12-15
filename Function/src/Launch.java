import java.util.function.Function;

public class Launch {
	public static void main(String[] args) {
		Function<String,Integer> f1= s->s.length();
		System.out.println(f1.apply("Irfan"));
		
		Function<Integer,Integer> f2= n-> n*n;
		System.out.println(f2.apply(4));
		
		Function<String,String> f3= s-> s.replaceAll(" ", "");
		System.out.println(f3.apply("Hello Every one"));
		
		Function<String,Integer> f4= s-> s.length()- s.replaceAll(" ", "").length();
		System.out.println(f4.apply("Hello Every one"));
		
		
	
	}

}
