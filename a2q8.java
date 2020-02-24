import java.util.Scanner;
interface EmpInterface
{
	void displayEmp();
	void giveBonus(double amount);
}
abstract class Employee
{
	int empID;
String fname;
	String lname;
	double salary;
}
class Manager extends Employee implements EmpInterface
{
	Manager(){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr ID: ");
		empID=sc.nextInt();
		System.out.println("Enter fname: ");
		 fname=sc.next();
		System.out.println("Enter lname: ");
		lname=sc.next();
		System.out.println("Enetr salary: ");
		 salary=sc.nextDouble();
	}
		
	
	public void displayEmp() {
		// TODO Auto-generated method stub
		System.out.println("Employee ID: "+empID);
		System.out.println("Employee First name: "+fname);
		System.out.println("Employee Last name: "+lname);
		System.out.println("Employee salary: "+salary);
	}
	public void giveBonus(double amount)
	{
		if(amount<=0)
		{
			System.out.println("wrong input");
		}
		else
		{
			salary=salary+amount;
		}
	}
	
		}

public class a2q8{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    Manager []e=new Manager[n];
    for(int i=0;i<n;i++)
    {
    	e[i]=new Manager();
    	e[i].giveBonus(500);
    	e[i].displayEmp();
    }
	}
}	
