import java.util.Scanner;
class person{
	String name;
	int age;
	person(String name, int age){
		this.name=name;
		this.age=age;
	}
}
class student1 extends person{
	
	String course;
	int roll;
	double marks;
	
	student1(String name, int age,String course,int roll,double marks) 
	{	
	super(name, age);
	this.course=course;
	this.roll=roll;
	this.marks= marks;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(course);
		System.out.println(roll);
		System.out.println(marks);
	}
}
class teacher extends person
{	
	String subject_assigned;
	String contact_hour;
	
	teacher(String name, int age,String subject_assigned,String contact_hour) 
	{
		super(name, age);
		this.subject_assigned=subject_assigned;
		this.contact_hour=contact_hour;
		
	}
	void display() 
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(subject_assigned);
		System.out.println(contact_hour);
	}

}
public class a2q5 
{

	public static void main(String[] args) 
	{
		person p1= new person(null, 20);


	}

}
