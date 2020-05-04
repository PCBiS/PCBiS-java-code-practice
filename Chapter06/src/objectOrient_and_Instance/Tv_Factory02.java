package objectOrient_and_Instance;

public class Tv_Factory02 {
	public static void main(String[] args) {
		
		Tv_Function tv1 = new Tv_Function(); // 서로 다른 참조변수 주소
		Tv_Function tv2 = new Tv_Function(); // tv1, tv2를 생성하였다.
						// new Tv_Function() <- 생성자
		System.out.println(tv1==tv2);
				
		System.out.println("============================");
		System.out.println("TV01의 channel : " + tv1.channel);
												//생성자를 이용하여 참조변수로 접근한다.
		System.out.println("TV02의 channel : " + tv2.channel);
		System.out.println("============================");
		
		tv1.channelChange(10);
		
		System.out.println("TV01의 channel : " + tv1.channel); 
		System.out.println("TV02의 channel : " + tv2.channel); 
		//tv1과는 독립 된 개체이기에 tv2의 채널은 기본값 그대로이다.
	}
}
