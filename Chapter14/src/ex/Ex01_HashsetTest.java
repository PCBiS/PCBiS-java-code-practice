package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex01_HashsetTest {
	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<String>();
		//ßHashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("First"); // Set 자료형은 중복을 허용하지 않는다, 하지만 저장을 막는것은 아니다.
		
		System.out.println("저장 된 데이터의 개수 : " + set.size());
		
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
	}
}
