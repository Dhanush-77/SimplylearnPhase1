package assignment;
import java.util.Scanner;

public class Simplecalculator {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the first no");
	
	int first=sc.nextInt();
	
    System.out.println("enter the second no  ");
   int second=sc.nextInt();
   
     System.out.println("enter your choice :");
     System.out.println("choice 1 : addition");
     System.out.println("choice 2 : multiplication");
     System.out.println("choice 3 : division");
     System.out.println("choice 4 : substraction");
      int choice=sc.nextInt();
      
    int addition=first+second;
    int multiplication= first*second;
    double division=first/second;
    int substraction=first-second;
    
      if(choice==1) {
    System.out.println("answer by adding"+addition);}
      
      if(choice==2) {
    System.out.println("answer by multiplying "+multiplication);}
      if(choice==3) {
    System.out.println("answer by dividing"+division);}
      if(choice==4) {
    System.out.println("answer by subtracting"+substraction);
	}
    

}
}
