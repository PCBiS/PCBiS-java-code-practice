package singleton_pattern;

public class Singleton_Ins {
	private static Singleton_Ins s = new Singleton_Ins(); // 항상 리턴해줄 값 s
	private Singleton_Ins() {
		System.out.println("싱글톤 인스턴스가 생성되었습니다...");
	}
	public static Singleton_Ins getInstance() {
		return s; // 미리 만들어진 값을 리턴해준다.
	}
}
