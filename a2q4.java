import java.util.Scanner;
class pointtype{
	float x;
	float y;
	
	void input(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the co-ordinates");
		x= sc.nextFloat();
		y= sc.nextFloat();
	}
	void display() {
		System.out.println("("+x+","+y+")");
	}
}

class circletype{
	float x;
	float y;
	float r;
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the co-ordinates of the centre");
		x= sc.nextFloat();
		y= sc.nextFloat();
		System.out.println("Enter the radius of the circle");
		r= sc.nextFloat();
	}
	void display() {
		System.out.println("centre of the circle is ("+x+","+y+")");	
		System.out.println("radius of the circle is "+r);
	}
	void circum() {
		double c= 2*Math.PI*r;
		System.out.println("Circumference of the circle is "+c);
	}
	void area() {
		double a= Math.PI*Math.pow(r, 2);
		System.out.println("Area of the circle is "+a);
	}
}

public class a2q4{
	public static void main(String args[]) {
		pointtype a1= new pointtype();
		a1.input();
		a1.display();
		circletype a2= new circletype();
		a2.input();
		a2.display();
		a2.circum();
		a2.area();
	}
}