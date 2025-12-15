package different_scenarios;

interface Ia{
	default void disp1() {
		System.out.println("Ia method");
	}
}
interface Ib{
	default void disp1() {
		System.out.println("Ib method");
	}
}

class Ca implements Ia,Ib {
	
	public void disp1() {
		System.out.println("Ca method"); // mandatory override to resolve  ambiguity 
		                                 // Otherwise Diamond problem occurs (multiple inheritance)
		
	}
	
}
public class Test2 {
	public static void main(String[] args) {
		Ca c= new Ca();
		c.disp1();
	}

}
