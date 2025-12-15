package different_cases;

interface Cal1{
	void mul();
}

interface Cal2{
	default void mul() {
		System.out.println("mul method of Cal2");
	}
}

abstract class Cal3 implements Cal1,Cal2{
	public void mul() {
		System.out.println("mul method of Ca32"); // overiding is mandatory (sloution 1)
	}
}

//abstract class Cal3 implements Cal1,Cal2{   
//	
//	public abstract void mul(); // (solution 2)
//}
public class Case4 {

}
