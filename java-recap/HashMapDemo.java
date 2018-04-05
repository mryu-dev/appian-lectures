import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> obj = new TreeMap<Integer, String>();
		obj.put(1, "Amit");
		obj.put(2, "Amol");
		obj.put(3, "Sumit");
		obj.put(4, "Sunil");
	//	obj.put(null, "Sunil");

		System.out.println(obj);
		System.out.println(obj.get(2));
		
		System.out.println("Key set is:");
		Set<Integer> s = obj.keySet();
		Iterator<Integer> i = s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println("Values is:");
		Collection<String> c = obj.values();
		Iterator<String> ci = c.iterator();
		while(ci.hasNext()){
			System.out.println(ci.next());
		}
		
		System.out.println("Entry is:");
		Set<Map.Entry<Integer, String>> eSet = obj.entrySet();
		Iterator<Entry<Integer, String>> entryIterator = eSet.iterator();
		while(entryIterator.hasNext()) {
			
				Entry e = entryIterator.next();
				System.out.println(e.getKey() +"\t"+e.getValue());
		}
	
		Map.Entry<Integer,String> ceil = obj.ceilingEntry(1);
		System.out.println(ceil.getKey()+" "+ceil.getValue());
		
	}
	
}











