import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<Integer> obj = new LinkedList<Integer>();
		obj.add(10);
		obj.add(10);
		obj.add(null);
		obj.add(30);
		obj.add(40);
		System.out.println(obj);
		obj.addFirst(50);
		obj.addLast(60);
		System.out.println(obj);
		System.out.println(obj.getFirst());
		System.out.println(obj.getLast());
		obj.removeFirst();
		obj.removeLast();
		System.out.println(obj);
		System.out.println(obj.peekFirst());
		System.out.println(obj.peekLast());
		System.out.println(obj.pollFirst());
		System.out.println(obj.pollLast());
		System.out.println(obj);
		Iterator<Integer> des = obj.descendingIterator();
		while (des.hasNext()) {
			System.out.println(des.next());
		}
		
	}
}






