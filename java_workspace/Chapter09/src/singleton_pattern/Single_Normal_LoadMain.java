package singleton_pattern;

public class Single_Normal_LoadMain {
	public static void main(String[] args) {
		// 일반 인스턴스 생성
		Normal_Ins normal01 = new Normal_Ins(); // 인스턴스 객체를
		Normal_Ins normal02 = new Normal_Ins(); // 두번 생성한다. new 두번 했으니까.
		// 싱글톤 인스턴스 생성
		//Singleton_Ins single01 = new Singleton_Ins(); <- 에러! new로는 생성 할 수 없다.
		Singleton_Ins single01 = Singleton_Ins.getInstance(); // 이미 생성된 객체를 불러온다.
		Singleton_Ins single02 = Singleton_Ins.getInstance(); // 그렇기에 다를 수가 없다. 그저 대입하는 대상이 달라질 뿐. 
		
		System.out.println(normal01==normal02?"normal01과 02는 동일한 메모리 주소를 가집니다.":"normal01과 02는 다른 메모리 주소를 가집니다.");
		System.out.println(single01==single02?"single01과 02는 동일한 메모리 주소를 가집니다.":"single01과 02는 다른 메모리 주소를 가집니다.");
		
	}
}
