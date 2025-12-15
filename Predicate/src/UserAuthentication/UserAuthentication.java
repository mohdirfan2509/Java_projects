// 
package UserAuthentication;
import java.util.function.Predicate;

public class UserAuthentication {
	public static void main(String[] args) {
		User u1= new User("ABHI","java");
	    Predicate<User> p = u -> u.userName.equals("ABHI") && u.Password.equals("java");
	    
	    if(p.test(u1)) System.out.println("User Authorised");
	    else System.out.println("User Un-Authorised");
	}
}
