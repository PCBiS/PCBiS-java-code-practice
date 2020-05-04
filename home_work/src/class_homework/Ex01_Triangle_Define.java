package class_homework;

public class Ex01_Triangle_Define {		// 클래스 : 데이터와 함수의 결합형. 
	int triangleBase;					// triangle_main 에서는 이 변수에 직접 엑세스 할 수 없다.
	int triangleHeight;					// 매개변수를 통한 인스턴스 화(Triangle_Define def = new TriangleDefine())
	final float DIV = 2f;  				//                                              ㄴ 참조변수
	
	/* 
	 * 생성자 : 인스턴스 생성시에 반드시 한번 실행한다. -> 인스턴스변수의 초기화 작업이 목적.
	 * 			기본생성자는 생략이 가능. (default constructor)
	 */
	
	//기본 생성자
	Ex01_Triangle_Define() { // 생략 가능.
		
	}
		
	// 하지만 생성자가 여러개일 때는 생성자가 자동으로 안생기기 때문에 생성자를 작성해주어야 한다. 
	Ex01_Triangle_Define(int base, int height) {
		triangleBase = base;
		triangleHeight = height;
	}	
	
	
	void triangleInfoSet(int base, int height) {
		triangleBase = base;
		triangleHeight = height;				
	}
	
	void triangleInfoPrint() {
		if (triangleBase<0&&triangleHeight<0) {
			System.out.println("입력된 값이 없습니다.");
			System.out.println("triangleInfoSet 으로 값을 입력해주세요.");
		}else {
			System.out.println("밑변의 길이 : " + triangleBase);
			System.out.println("삼각형의 높이 : " + triangleHeight);
		}
	}
	
	float triangleArea() {
		return (triangleBase*triangleHeight)/DIV;
	}
		
	float triangleArea(int base, int height){		
		return (base*height)/DIV;
	}
}
