package getterSetterMethod;

import java.util.Scanner;

public class InfosysEmployee {

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name:");
		e1.setName(s.next());
		System.out.println("Enter ID:");
		e1.setId(s.next());
		System.out.println("Enter Salary:");
		e1.setSal(s.nextDouble());
		System.out.println("====================");
		
		System.out.println("Name: "+e1.getName());
		System.out.println("ID: "+e1.getId());
		System.out.println("Salary: "+e1.getSal());
		

	}

}
