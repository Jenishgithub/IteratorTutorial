import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> stockTable = new Hashtable<Integer, String>();

		// populating hashtable instance with sample values
		stockTable.put(new Integer(1), "One");
		stockTable.put(new Integer(2), "Two");
		stockTable.put(new Integer(3), "Three");

		// gettting set of keys for iteration
		Set<Entry<Integer, String>> stockset = stockTable.entrySet();
		/**
		 * entrySet() returns a Set containing all the mapping in this map .
		 * return type of entrySet is Set<Entry<K, V>>
		 */
		Iterator<Entry<Integer, String>> i = stockset.iterator();
		/**
		 * iterator() returns the iterator on the elements of this set. Return
		 * type of this method must be of type Iterator<E>
		 */

		System.out.println("Iterating over hashtable in java");

		while (i.hasNext()) {
			Map.Entry<Integer, String> m = i.next();
			int key = m.getKey();
			String value = m.getValue();
			System.out.println("Key: " + key + "value:  " + value);

		}
		// iteration has finished

	}
}
