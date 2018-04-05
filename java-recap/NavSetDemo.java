import java.util.NavigableSet;
import java.util.TreeSet;

/*
 * 
 * ceiling(), floor(), higher(), and lower()

   The ceiling() method returns the least (smallest) element in this set that is greater than or 
   equal to the element passed as parameter to the ceiling() method. 

   The floor() method does the opposite of ceiling()

   The higher() method returns the least (smallest) element in this set that is greater than 
   (not equal too) the element passed as parameter to the higher() method.
	
   pollFirst() and pollLast()

   The pollFirst() method returns and removes the "first" element in the NavigableSet 
   or null if the set is empty. The pollLast() returns and removes the "last" element 
   in the set or null if the set is empty. "First" means smallest element according to the 
   sort order of the set. "Last" means largest according to the element sorting order of the set.
 * 
 */
public class NavSetDemo {

	public static void main(String[] args) {
		NavigableSet original = new TreeSet();
		original.add("1");
		original.add("2");
		original.add("3");
		original.add("4");

		//ceiling will be "2".
		Object ceiling = original.ceiling("2");
		System.out.println(ceiling);

		//floor will be "2".
		Object floor = original.floor("2");
		System.out.println(floor);
		
		//higher will be "3".
		Object higher = original.higher("2");
		System.out.println(higher);

		//lower will be "1"
		Object lower = original.lower("2");
		System.out.println(lower);

		//first is "1"
		Object first = original.pollFirst();
		System.out.println(first);

		//last is "4"
		Object last = original.pollLast();
		System.out.println(last);

		System.out.println(original);
	}

}
