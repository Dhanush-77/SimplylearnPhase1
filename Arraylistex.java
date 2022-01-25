package assignment;
import java.util.ArrayList;

public class Arraylistex {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(60);
		list.add(70);
		
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		System.out.println(list.contains(10));
		System.out.println(list.contains(20));
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println("size :"+list.size());
		
		for(Integer r:list) {
			System.out.println(r);
		}
	}
}
