package main;

import ex.Member;
import singleton_pattern.Singleton;

public class TestMain {	
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setId("test001");
		System.out.println(m1.getId());
		
		Singleton s = Singleton.getInstance();
		s.print();
	}
}                                       
