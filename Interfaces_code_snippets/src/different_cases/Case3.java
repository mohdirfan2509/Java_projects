package different_cases;

interface A{
	void mul(); 
}

interface B{
	default void mul() {
		System.out.println("default method of B");
	}

}

interface C extends A,B{
//	default void mul() {
//		System.out.println("default method off C");  This is one way of avoiding compilation error
//	}
	 void mul();  // This is one way of avoiding compilation error
	               // but C should not be empty 

	
	

}
public class Case3 {
	public static void main(String[] args) {
		
	}

}
