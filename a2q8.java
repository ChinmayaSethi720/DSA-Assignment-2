import java.util.Scanner;
interface Empinterface{
	void displayEmp();
	void giveBonus(double amount);
}
abstract class Employe{
	public abstract void emp();
}
class empid extends Employe{
	Scanner sc= new Scanner(System.in);
	public void emp() {
		System.out.println("Enter Employee ID: ");
		String id= sc.next();
		System.out.println("Employee ID: "+id);
	}
}
class fname extends Employe{
	Scanner sc= new Scanner(System.in);
	public void emp() {
		System.out.println("Enter first name: ");
		String fname= sc.next();
		System.out.print("Name: "+fname);
	}
}
class lname extends Employe{
	Scanner sc= new Scanner(System.in);
	public void emp() {
		System.out.println("Enter last name: ");
		String lname= sc.next();
		System.out.println(" "+lname);
	}
}
class salary extends Employe{
	Scanner sc= new Scanner (System.in);
	public void emp() {
		System.out.println("Enter salary: ");
		int salary= sc.nextInt();
		System.out.println("Salary: "+salary);
	}
}
public class a2q8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employe id= new empid();
fname fn= new fname();
lname ln= new lname();
salary sal= new salary();

id.emp();
fn.emp();
ln.emp();
sal.emp();
	}

}
