package predicateProblems;

public class Employee {
	public String name;
	public String designation;
	public double salary;
	public String city;
	public Employee(String name, String designation, double salary, String city) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee name:"+name +"\n"+"Employee designation:"+designation+"\n"+
				"Employee salary: "+salary+"\n"+"Employee city:"+city;
	}
	  

}
