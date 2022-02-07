package datastructures;
import java.util.Scanner;
import java.util.Stack;
public class Stackdemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Stack<String> stack=new Stack<String>();
		
		//adding elements to stack
		stack.push("first");
		stack.push("second");
		stack.push("third");
		stack.push("fourth");
		stack.push("fifth");
		
		System.out.println("initial stack");
		System.out.println(stack);
		System.out.println("enter a string to check");
		
		String user=sc.next();
		
		
		//checking if string is present in stack
		
		if(stack.search(user)!=-1) {
			
			System.out.println("given string "+user+" exists in stack");
			
		}
		else {
			System.out.println("given string "+user+" does not exists in stack");
		}
		 //removing elements from the stack
		
		stack.pop();
		System.out.println(stack);
		stack.pop();
		
		System.out.println(stack);
		
		//popping out all elemnets until thers are no elements
		while(! stack.empty()) {
			stack.pop();
			System.out.println("stack after popping one element"+stack);
		}
		
		
	}

}

