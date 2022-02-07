package datastructures;
import java.util.LinkedList;
import java.util.Iterator;
public class Linkeddemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		//adding elements
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		
		
		System.out.println("printing elements  "+ll);
		
		Iterator it=ll.iterator();
		
		System.out.println("\nprinting elements from linked list");
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//printing indescending order
		
		it=ll.descendingIterator();
           System.out.println("\nprinting elements from linked list");
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
