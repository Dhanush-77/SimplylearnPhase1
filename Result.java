package assignment;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		
		Scanner res=new Scanner(System.in);
		
		System.out.println("enter the marks");
		
		int marks=res.nextInt();
		
		if(marks>70&&marks<=100) {
			System.out.println("distinction");
			
		}
		
		else if(marks>60&&marks<=70) {
			System.out.println("firstclass");
		}
		
		else if (marks>50&&marks<=60) {
			
			System.out.println("secondclass");
			
		}
		
		else if(marks>35&&marks<=50) {
			System.out.println("pass");
		}
		
		else if(marks>0&&marks<=34) {
			System.out.println("fail");
		}
		else {
			System.out.println("kindly enter correct result");
		}
		
	}
}
