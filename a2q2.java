class complex
{
	private double real,imag;
	complex(double real,double imag)
	{
		this.real=real;
		this.imag=imag;
	}
	void display()
	{
		System.out.println("("+real+","+imag+")");
		
	}
	double getreal()
	{
		return real;
		
	}
	double getimag()
	{
		return imag;
	}
	complex add(complex c)
	{
		double r=real+c.getreal();
		double i=imag+c.getimag();
		complex c3=new complex(r,i);
		return c3;
	}
	
}	
	

public class A2Q2{

	public static void main(String[] args) {
		complex c1=new complex(10,5);
		complex c2=new complex(5,10);
		c1.display();
		c2.display();
		complex c3=c1.add(c2);
		c3.display();
	
		

	}

}
