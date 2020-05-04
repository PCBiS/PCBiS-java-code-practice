package car;

public class CarFactory {
	public static void main(String[] args) {
		Car car01 = null;
		FireEngine fe01 = new FireEngine();
		FireEngine fe02 = null;
		Ambulance am01 = null;
		
		fe01.water();
		car01 = fe01;
		//car01 = (Car)fe01; 명시적으로 (Car)를 써줘야 함.
		//하위클래스가 상위클래스로 형변환 할 때에는 형변환문 생략가능.
		// car01.water(); <- 사용불가.
		
		fe02 = (FireEngine)car01;
		// fe02 = car01; <- 형변환 불가, 명시적으로 변환할 형을 선언해야 함.
				
		// am01 = (Ambulance)car01;
		// am01.siren(); <- 위 처럼 강제적 형변환 시도시 형변환 할 수 없다고 오류가 생긴다.
		
		System.out.println(car01 instanceof Ambulance);
		System.out.println(car01 instanceof FireEngine);
		
		if (car01 instanceof Ambulance) { // 만약 형변환이 된다고 하면
			am01 = (Ambulance)car01;
			am01.siren();
		}else {
			System.out.println("형변환이 불가합니다.");
		}
		
	}
}

