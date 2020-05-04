package tv;

public class TV_Main {
	public static void main(String[] args) {
		Tv tv01 = new Tv(); // <-- 기존까지 사용 하던 방식
		CaptionTV ctv01 = new CaptionTV(); // 상속받은 자녀지만 사용방식 자체는 기존과 동일.
		//하위클래스의 참조형 ctv01 = 하위클래스의 형
		Tv t = ctv01; // 자동으로 형변환 - CaptionTV가 가지고 있는 Tv의 형을 자동으로 변환한다.
		// 위의 형변환은 Tv t = (Tv)ctv01; 이랑 동일함.
		
		ipTV itv03 = (ipTV)tv02;
		
		
		
		
		
		
		
		
		
		
		
		Tv tv02 = new CaptionTV(); // <- 다향성의 대표적 예제
		// CaptionTV ctv02 = new Tv(); // 불가능!
		
		((CaptionTV) tv02).caption(); //형변환 예시 :  Tv 타입을 CaptionTV 로 형변환.
		
		CaptionTV ctv02 = (CaptionTV)tv02; // 예시 : 
		ctv02.caption();
		
		
		
		System.out.println(tv02.power);
		tv02.power();
		System.out.println(tv02.power);
		tv02.display();
		
		Tv tv03 = new ipTV();
		
		Tv[] tvs = new Tv[4];
		tvs[0] = new Tv();
		tvs[1] = new CaptionTV();
		tvs[2] = new ipTV();
		tvs[3] = new SmartTv();
		
		for (int i = 0; i < tvs.length; i++) {
			tvs[i].display();			
		}
	}
}
