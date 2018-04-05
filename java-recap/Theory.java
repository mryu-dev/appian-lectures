
public class Theory {
/*
 * http://www.java-forums.org/java-tutorial/4480-java-collection-framework-sets.html
 * http://tutorials.jenkov.com/java-collections/map.html

http://tutorials.jenkov.com/java-collections/index.html

 *  
 *  amortised time means "average time taken per operation, if you do many operations".

Theory
List, Map & Set
ArrayList - Example - How to make it synchronized?
List list = Collections.synchronizedList(new ArrayList(...));
Capacity of ArrayList - 10 defaults
 removeAll -- clear()
 
LinkedList -- allow null & duplicate

Vector

Set:
HashSet : 
no duplicate, only one null
it does not guarantee that the order will remain constant over time
 is not synchronized.
Set s = Collections.synchronizedSet(new HashSet(...));
Capacity of HashSet - 16 default
LoadCapacity - 0.75
 
TreeSet
no duplicate, no null
SortedSet
is not synchronized
SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...));

NavigableSet:
descendingIterator() and descendingSet()
headSet(), tailSet() and subSet()
headSet(26, inclusive = true) (include 26 in set also)
ceiling(), floor(), higher() and lower()
pollFirst() and pollLast()


Differences between HashSet and TreeSet

Many developer are confused about sets and ask when to use HashSet and when to use TreeSet. Keep following points in mind for deciding the right set.
- HashSet is much faster than TreeSet.
- HashSet offers no ordering guarantees. 
- TreeSet is preffered when performing operations in the SortedSet.
- HashSet can be tuned by specifying the right initial capacity using the constructor HashSet(int initialCapacity).
- TreeSet has no tuning parameters.


Map:
HashMap:
An object that maps keys to values. 
A map cannot contain duplicate keys; each key can map to at most one value.

This implementation provides all of the optional map operations, 
and permits null values and the null key. 
(The HashMap class is roughly equivalent to Hashtable, 
except that it is unsynchronized and permits nulls.)
Map m = Collections.synchronizedMap(new HashMap(...));

This class makes no guarantees as to the order of the map; 
in particular, it does not guarantee that the order will remain constant over time.

TreeMap:
The map is sorted according to the natural ordering of its keys
This implementation provides all of the optional map operations, 
and permits null values and the not null key. 

 */
}
