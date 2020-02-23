import java.util.Scanner;
abstract class shape{
	public abstract void area();
}

class square extends shape{
Scanner sc= new Scanner (System.in);
	public void area() {
		System.out.println("Enter the side of square: ");
		double s= sc.nextDouble();
		double a=Math.pow(s, 2);
		System.out.println("Area of square is "+a);
	}	
}
class circle extends shape{
	Scanner sc= new Scanner (System.in);
	public void area() {
		System.out.println("Enter the radius of circle");
		double r= sc.nextDouble();
		double a = Math.PI*Math.pow(r, 2);
		System.out.println("Area of circle is "+a);
	}	
}
class triangle extends shape{
	Scanner sc= new Scanner (System.in);
	public void area() {
		System.out.println("enter the three sides of triangle");
		double s1= sc.nextDouble();
		double s2= sc.nextDouble();
		double s3= sc.nextDouble();
		double s=(s1+s2+s3)/2;
		double a= Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		
		System.out.println("Area of the triangle is "+a);
	}
}
public class a2q6 {
	public static void main(String[] args) {
		shape sq= new square();
		sq.area();
		shape cir= new circle();
		cir.area();
		shape tri= new triangle();
		tri.area();
		
	}

}
