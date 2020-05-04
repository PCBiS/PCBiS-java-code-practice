package ex;

import java.util.HashMap;
import java.util.Map;

public class Ex05_HashMap {
	public static void main(String[] args) {
		Map<Integer, String> hash  = new HashMap<Integer, String>();
		hash.put(0, "1번");
		hash.put(1, "2번");
		hash.put(2, "3번");
		hash.put(8, "8번");
		hash.put(3, "3번");
		
		for (int i = 0; i < hash.size(); i++) {
			System.out.println(hash.get(i));
		}
		
		System.out.println("1번 학생의 이름 : " + hash.get(1));
		
		hash.remove(8);
		System.out.println("8번 학생의 이름 : " + hash.get(8)); // set과는 다르게 null이 나옴.
		
		//같은 키 값은 중복되지 않는다.
		System.out.println("2번 학생의 이름(중복입력전) : " + hash.get(2));
		hash.put(2, "Two");
		System.out.println("2번 학생의 이름(중복입력후) : " + hash.get(2));
		
		
	}
}
