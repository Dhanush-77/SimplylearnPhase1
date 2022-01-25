package assignment;
import java.util.Scanner;
public class Voting {

	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter age of candidate");
		
		int age=sc1.nextInt();
		
		if(age>18) {
			
			System.out.println("Eligible for voting");
		}
		
		else {
			
			System.out.println("not elegible for voting");
		}
		
	}
}
