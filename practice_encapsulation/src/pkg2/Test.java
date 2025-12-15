package pkg2;
import pkg1.Account;

public class Test extends Account
{		
	  public static void main(String[] args) {
	        Account acc = new Account();
	        Test t = new Test();

//	         System.out.println(acc.getBalance()); // Line X
	        System.out.println(t.getBalance());     // Line Y
	    }

}


class Test1 extends Test
{
	void disp()
	{
		 getBalance();
	}
}