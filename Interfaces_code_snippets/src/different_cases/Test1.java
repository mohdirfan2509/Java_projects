
package different_cases;

interface Calculator1{
	default void mul(){
		System.out.println("Cal1 mul method");
	} 
}

interface Calculator2{
	default void mul(){
		System.out.println("Cal1 mul method");
	} 
}

interface Calculator3 extends Calculator1,Calculator2{
	public void mul(); // must to overrided
}
public class Test1 {
	public static void main(String[] args) {
		
	}

}
