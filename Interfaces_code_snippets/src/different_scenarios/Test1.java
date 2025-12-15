package different_scenarios;

interface If1{
    static int a =5; //implicitly public static final
    int b=10;
}

class C1 implements If1{
    void disp(){
        System.out.println(If1.a);
        System.out.println(If1.b);
    }
  
}
public class Test1 
{
	public static void main(String[] args) {
	    C1 c= new C1();
		c.disp(); // valid 
	}
}
