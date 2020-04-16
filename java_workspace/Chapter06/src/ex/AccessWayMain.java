package ex;

public class AccessWayMain {
	//static 변수의 참조방법.
	public static void main(String[] args) {
		System.out.println(AccessWay.num); // AccessWay의 num이라는 static 변수에 직접 액세스 하였다
		AccessWay.num++; // 직접 액세스한 변수의 값을 증가시킨다.
		System.out.println(AccessWay.num);
		
		AccessWay ac = new AccessWay();
		System.out.println(ac.num2);
	}
}
