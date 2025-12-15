package different_cases;


interface Calc{
	default void mul() {
		System.out.println("Calc default method");
	}
}

class Maths{
	public void mul() {
		System.out.println("Maths concrete method");
	}
}

class Casio1 extends Maths implements Calc{ 
	
	
}

public class Case6 {

}
