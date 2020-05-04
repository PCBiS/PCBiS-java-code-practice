package inheritance;

public class BusinessMan extends Man {
	
	String company;
	String position;
	/*
	 * 조상 클래스의 생성자가 있다면 자손클래스의 생성자에서 값을 받아 
	 * 조상클래스의 생성자(Man.java 의 name)를 호출하여 초기화 해준다. 
	 */
	BusinessMan(String name, String company, String position){
		super(name); // 조상 클래스의 생성자를 가장 먼저 초기화 해준다.
					// super는 생성자에서 맨 위에 위치해야 한다.
		this.company = company;
		this.position = position;
	}
	
	void tellURInfo() {
		// super.tellURName(); // 상위클래스의 메소드를 이렇게 호출 가능하다.
		tellURName(); // 상속했으니 이렇게 호출도 가능하다.
		System.out.println("내 직장명은 " + company + " 입니다.");
		System.out.println("내 직급은 " + position + " 입니다.");
	}
}
