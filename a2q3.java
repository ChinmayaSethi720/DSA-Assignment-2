import java.util.Scanner;
class student{
	int roll;
	String name;
	String course;
	
	void input_Student () {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter roll number, name and course");
		roll= sc.nextInt();
		name=sc.next();
		course=sc.next();	
	}
	
	void display_Student (){

	}
}
class Exam extends student{
	Scanner sc= new Scanner(System.in);
	
	double mark1;
	double mark2;
	double mark3;
	
	void input_Marks () {
		System.out.println("Enter marks");
		mark1= sc.nextInt();
		mark2= sc.nextInt();
		mark3= sc.nextInt();		
	}
	
	void display_Result () {
		System.out.println(name+" "+roll+" "+course);
		System.out.println(mark1+" "+mark2+" "+" "+mark3);
	}
	
}

public class a2q3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n= sc.nextInt();
		Exam exam[]= new Exam[n];
		
		for (int i=0; i<n; i++) {
			exam[i]= new Exam();
			exam[i].input_Student();
			exam[i].input_Marks();
			exam[i].display_Student();
			
			exam[i].display_Result();
			
		}
	}}
