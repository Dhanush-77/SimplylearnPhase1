package assignment;
import java.util.Scanner;
public class SimplInterest {


	
	public static void main(String[] args) {
		double SI;
		
		Scanner input=new Scanner(System.in);
		 
		System.out.println("enter the principle amount");
		double amount=input.nextDouble();
		
		System.out.println("enter the rate of interest");
		float rate=input.nextFloat();
		
		System.out.println(" enter the time period");
		int year=input.nextInt();
		
		SI= (amount*rate*year)/100;
		
		
		System.out.println("simple interest is :"+ SI);
		
				
	}
	
}
