package ex;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class Ex06_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		
		tMap.put(1, "1-data");
		tMap.put(5, "5-data");
		tMap.put(3, "3-data");
		tMap.put(2, "1-data");
		tMap.put(4, "4-data");
		
		// Map -> Collection
		// Map -> Set
		
		NavigableSet<Integer> navi = tMap.navigableKeySet();
		Iterator<Integer> itr = navi.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		itr = navi.descendingIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}
}
