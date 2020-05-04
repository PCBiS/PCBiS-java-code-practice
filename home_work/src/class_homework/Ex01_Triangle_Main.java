package class_homework;

public class Ex01_Triangle_Main {
	public static void main(String[] args) {
		float result;
		Ex01_Triangle_Define def = new Ex01_Triangle_Define(); // 참조변수 def에 Triangle_Define을 인스턴스 변수로 불러옴
		def.triangleInfoSet(10, 6);
		def.triangleInfoPrint();
		result = def.triangleArea();
		System.out.println(result);
		
		
		Ex01_Triangle_Define def2 = null; // 참조변수 def2는 null이라고 선언한 상황.		
		if (def2==null) {
			System.out.println("참조변수가 null 입니다.");
		}
		/* System.out.println(def2.triangleArea(5, 13)); 
		 * 결과 : Null Pointer Exeception 오류 발생.
		 * 이유 : 참조변수가 null 이기 때문에 참조할 값(참조할 주소)이 없어서 발생한 현상.
		 */
		
		float result02;
		Ex01_Triangle_Define def3 = new Ex01_Triangle_Define(15, 32);
		result02 = def3.triangleArea();
		System.out.println(result02);
		
	}
}
