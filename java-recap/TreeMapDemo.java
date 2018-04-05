import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
	
		treeMap.put("Name1", "Hello");
		treeMap.put("Name2", null);
		treeMap.put("Name1", "Hello");
		treeMap.put("Name1", "Hello");
		
		Iterator<String> it = treeMap.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.print(key+" ");
			System.out.print(treeMap.get(key));
			System.out.println();
		}
		System.out.println();
	
		Set<Map.Entry<String, String>> entry1 = x();

		Iterator<Entry<String, String>> i = entry1.iterator();
		while(i.hasNext()) {
			Map.Entry<String, String> entry2 = i.next();
			System.out.print(entry2.getKey());
			System.out.print(entry2.getValue());
			System.out.println();
		}


	/*		
		NavigableMap<String, String> nav = treeMap;
		Map.Entry<String, String> entry = nav.pollFirstEntry();
		String key = (String) entry.getKey();
		System.out.print("Key is: "+ key+" ");
		System.out.print(entry.getValue());
		System.out.println();
		System.out.println();

	*/
		
	}
}
