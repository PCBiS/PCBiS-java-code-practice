package ex;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex03_TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> sTree = new TreeSet<Integer>();
		
		sTree.add(1);
		sTree.add(2);
		sTree.add(4);
		sTree.add(3);
		sTree.add(1);
		sTree.add(2);
		
		System.out.println("sTree의 요소의 개수 : " + sTree.size());
		Iterator<Integer> itr = sTree.iterator();
		while (itr.hasNext() ) {
			System.out.println(itr.next());
		}
		
	}
}
