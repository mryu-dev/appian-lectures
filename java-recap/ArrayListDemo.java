import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;


public class ArrayListDemo {
	public static void main(String[] args) {
		
		Vector<Integer> obj = new Vector<Integer>();
		
		obj.add(10);
		obj.add(10);
		obj.add(null);
		obj.add(30);
		obj.add(40);
		System.out.println(obj);
		obj.add(2, 50);
		System.out.println(obj);
		System.out.println(obj.get(4));
		obj.set(3, 70);					//replace
		System.out.println(obj);
		
		Iterator<Integer> i = obj.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			//i.remove();
		}
		System.out.println("List iterator");
		ListIterator<Integer> li = obj.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		System.out.println(obj.size());
		
		Enumeration<Integer> e = obj.elements();
		while (e.hasMoreElements()) {
			Integer val = (Integer) e.nextElement();
			System.out.println(val);
		}
		//List<Integer> newobj = Collections.synchronizedList(obj);
		obj.clear();
		System.out.println(obj);
		
	}
}














