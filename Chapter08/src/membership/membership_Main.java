package membership;

public class membership_Main {
	public static void main(String[] args) {
		// 회원정보 5개 저장이 가능한 배열을 선언
		
		Member[] members = new Member[5];
		
		members[0] = new Member("cool", "시원한", "cool@gmail.com");
		members[1] = new Member("hot", "뜨거운", "hot@gmail.com");
		members[2] = new Member("warm", "따듯한", "warm@gmail.com");
		members[3] = new Member("cold", "차가운", "cold@gmail.com");
		members[4] = new Member("sleepy", "졸린", "sleepy@gmail.com");
		
		for (int i = 0; i < members.length; i++) {
			members[i].showInfo();
		}
		
		
	}
}
