package predicateProblems;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Launch {
	
	static void populate(ArrayList<Employee> al) {
		
		while(true) {
			System.out.println("Enter 0 if you want to add Employees");
			System.out.println("Enter 1 if you want to stop and see details");
			Scanner scan= new Scanner(System.in);
			int option=scan.nextInt();
			if(option==1) break;
			else {
				System.out.println("Enter Employee name:");
				String empName=scan.next();
				System.out.println("Enter Employee designation:");
				String desg=scan.next();
				System.out.println("Enter Employee salary:");
				double empSalary =scan.nextDouble();
				System.out.println("Enter Employee city:");
				String empCity=scan.next();
				al.add(new Employee(empName,desg,empSalary,empCity));
				
			}
			
		}
		

			
	}
	static void check(Predicate<Employee> p,ArrayList<Employee> al){
		
		for(Employee e:al) {
			if(p.test(e)) System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		populate(al);
		Predicate<Employee> isManager= emp-> emp.designation.equals("Manager");
		System.out.println("Managers info");
		check(isManager, al);
		Predicate<Employee> isFromBengaluru= emp-> emp.city.equals("Bengaluru");
		System.out.println("Bengaluru city Employees info");
		check(isFromBengaluru, al);
		
		Predicate<Employee> isSalary= emp-> emp.salary< 30000;
		System.out.println("Employees with salary below 30000");
		check(isSalary, al);
		
		System.out.println("managers and salary less than 30,000 RS");
		check(isSalary.and(isManager), al);
		System.out.println("managers or salary less than 30,000 RS");
		check(isSalary.or(isManager),al);
		check(isManager.negate(), al);
		
		
		
		
	}
	
	

}
