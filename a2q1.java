import java.util.Scanner;
class commission
{
	double sales;
	commission(double sales)
	{
		this.sales=sales;
	}
	
	double getCommission() {
		double comm=0.0;
		if(sales<500) 
			comm= 0.02*sales;
		else if(sales>=500 && sales<5000) 
			comm= 0.05*sales;
		else if(sales>=5000) 
			comm= 0.08*sales;
		return comm;				
	}		
}	
public class a2q1{
public static void main(String [] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of sales: ");
	
	double sales= sc.nextDouble();
	if (sales<0)
	{
		System.out.println("Invalid input");
	}
	else {
		commission c1= new commission (sales);
		double comm= c1.getCommission();
		System.out.println(comm);
	}	
}
} 