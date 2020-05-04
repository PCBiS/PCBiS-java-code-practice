package friend;

public class UnivFriend extends Friend {
	String major;
	int grade;
	
	public UnivFriend(String name, String phoneNum, String addr, String major, int grade) {
		super(name, phoneNum, addr);
		this.major = major;
		this.grade = grade;
	}
	
	@Override
	void showData() {
		super.showBasicInfo();
		System.out.println("전   공 : " + major);
		System.out.println("학   년 : " + grade);
	}
	
}
