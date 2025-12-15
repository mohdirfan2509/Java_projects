package different_cases;

interface Calc{
	void mul();
}

class Maths{
	public void mul() {
		System.out.println("Maths concrete method");
	}
}

class Casio1 extends Maths implements Calc{ 
	// here mul method is inherited from Maths class
	// and it becomes overridden method for mul
	// of Calc interface with respect to Calc interface
	
}
public class Case5 {

}
