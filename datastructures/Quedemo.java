package datastructures;
import java.util.Iterator;
import java.util.PriorityQueue;
public class Quedemo {
	public static void main(String[] args) {
		
		PriorityQueue<String> queue=new PriorityQueue<String>();
		
		queue.add("person1");
		queue.add("person2");
		queue.add("person3");
		queue.add("person4");
		queue.add("person5");
		queue.add("person6");
		  
		System.out.println("elements in the queue are:"+queue);
		
		//returns null if queue is empty
		System.out.println("head of the element in queue is : "+ queue.element());
		System.out.println("head of the element in queue is : "+ queue.peek());
		
		//inserting an element to queue
		
		queue.offer("person7");
		System.out.println("elements in the queue are:"+queue);
		
		//returns null if queue is empty
		queue.poll();
		System.out.println("elements after removing are"+queue);
		queue.remove();
		System.out.println("elements after removing are"+queue);
		
		//itereating elements
		Iterator it=queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
	
		
		
		
	}

}
