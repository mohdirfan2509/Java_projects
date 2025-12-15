package different_scenarios;

interface I1{
	default void disp1() {
		System.out.println("Ia method");
	}
}
interface I2 extends I1{
	default void disp1() {
		System.out.println("Ib method");
	}
}

class C2 implements I1,I2 {
	
	public void disp1() {
		System.out.println("Ca method");
		
	}
	
}
public class Test3 {
	public static void main(String[] args) {
		C2 c= new C2();
		c.disp1();
		 
		
		
	}

}
