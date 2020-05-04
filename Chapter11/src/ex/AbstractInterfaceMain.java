package ex;

public class AbstractInterfaceMain {
	public static void main(String[] args) {
		// PersonalNumberStorage storage = new PersonalNumberStorageImpl(100); <- 추상클래스
		// ▼▼ 인터페이스 : 다형성 적용 가능.
		PersonalNumber storage = new PersonalNumberStorageImpl(100); 
		
		storage.addPersonalInfo("101011-1123456", "aaa");
		storage.addPersonalInfo("101012-1225656", "bbb");
		
		System.out.println(storage.searchName("101011-1123456"));
		System.out.println(storage.searchName("101012-1225656"));
	}
}
