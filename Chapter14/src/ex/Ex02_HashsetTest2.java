package ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02_HashsetTest2 {
	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<String>();
		//ßHashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("First"); // Set 자료형은 중복을 허용하지 않는다, 하지만 저장을 막는것은 아니다.
						  // 참조변수 주소 값(메모리 주소 값)이 변경된 값이기 때문에 겉으로 표시되는것은 같아도 메모리 주소는 다르다.
		
		System.out.println("저장 된 데이터의 개수 : " + set.size());
		
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		
		System.out.println("hSet에 저장 된 데이터 수 : " + hSet.size());
		
		Iterator<SimpleNumber> itr2 = hSet.iterator();
		
		while (itr2.hasNext()) {
			System.out.println(itr.next());
		}
		
	}	
	
	
}

class SimpleNumber {
	int num;
	
	public SimpleNumber (int n) {
		num = n;
	}
	
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return this.num/2;				
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		
		if (obj instanceof SimpleNumber) {
			SimpleNumber sm = (SimpleNumber)obj;
			result = this.num == sm.num;
		}
		return result; 
	}
	
	
	
}
