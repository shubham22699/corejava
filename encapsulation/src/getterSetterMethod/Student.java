package getterSetterMethod;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private double marks;
	
	public void setId(int id)
	{
		this.id = id;
	}

	public int getId()
	{
		return id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setMarks(float marks) 
	{
		this.marks = marks;
	}

	public double getMarks() 
	{
		return marks;
	}
	public String toString()
	{
		return  "Details of Student are:  "+"id: "+ id + "  name: " + name + "  marks: " + marks;
	}
    void displayDetails()
  	{
    	Scanner sc=new Scanner(System.in);

		System.out.println("Enter the student id: ");
		this.id=sc.nextInt();
				
		System.out.println("Enter the student name: ");
		this.name=sc.next();

		System.out.println("Enter the student marks: ");
		this.marks=sc.nextDouble();
	}


}
