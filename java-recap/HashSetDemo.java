import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class HashSetDemo {
	public static void main(String[] args) {
		
		HashSet<String> obj1 = new HashSet<String>();
		obj1.add("France");
		obj1.add("India");
		obj1.add("US");
		System.out.println(obj1);
		
		HashSet<String> obj2 = new HashSet<String>();
		obj2.add("France");
		obj2.add("UK");
		System.out.println(obj2);
	//	obj1.addAll(obj2);
	//	System.out.println(obj1);

		obj1.retainAll(obj2);
		System.out.println(obj1);
		
		Iterator<String> i = obj1.iterator();
		while (i.hasNext()) {
			String str = i.next();
			System.out.println(str);
		}
	}
}







