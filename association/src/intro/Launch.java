package intro;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address(18,"1st cross","RT nagar",506,"bengaluru","KA");
		Student s= new Student("Munaf",118, false, a);
		System.out.println(s);
	}

}
