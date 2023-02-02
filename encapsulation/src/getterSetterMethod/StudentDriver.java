package getterSetterMethod;

public class StudentDriver {
		
	  	    public static void main(String[] args) {
			Student s1=new Student();
			System.out.println("Details of Student 1:");
			s1.displayDetails();
			System.out.println("======================");
			
			Student s2=new Student();
			System.out.println("Details of Student 2:");
			s2.displayDetails();
			System.out.println("======================");

			Student s3=new Student();
			System.out.println("Details of Student 3:");
			s3.displayDetails();
			System.out.println("=====================");
			
			System.out.println(s1.toString());
			System.out.println("=====================");
			
			System.out.println(s2.toString());
			System.out.println("=====================");
			
			System.out.println(s3.toString());

		}

	

}
