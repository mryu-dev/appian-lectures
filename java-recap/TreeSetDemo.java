import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;


public class TreeSetDemo {

	
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(10);
		treeSet.add(11);
		treeSet.add(26);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(22);		
		treeSet.add(60);		
		treeSet.add(70);
		
		System.out.println(treeSet);
		Iterator<Integer> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		System.out.println();

		System.out.println("First element:"+treeSet.first());
		System.out.println("Last element:"+treeSet.last());

		System.out.println("Poll First:"+treeSet.pollFirst());
		System.out.println("Poll Last:"+treeSet.pollLast());

		System.out.println("Floor of 27:"+treeSet.floor(27));
		System.out.println("Ceiling of 27:"+treeSet.ceiling(27));

		System.out.println("Higher of 26:"+treeSet.higher(26));
		System.out.println("Lower of 26:"+treeSet.lower(26));

	

       NavigableSet<Integer> navigableSet = new TreeSet<Integer>(treeSet);

	System.out.println("Floor of 27:"+navigableSet.floor(27));
	System.out.println("Ceiling of 27:"+navigableSet.ceiling(27));
        System.out.println(navigableSet.headSet(26));
        System.out.println(navigableSet.subSet(11, 30));
        System.out.println(navigableSet.ceiling(12));
        System.out.println(navigableSet.pollLast());
	}
}
