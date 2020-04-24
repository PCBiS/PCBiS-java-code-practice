package friend;

public class HighFriend extends Friend {
	String job;

	public HighFriend(String name, String phoneNum, String addr, String job) {
		super(name, phoneNum, addr);
		this.job = job;
	}
	
	/*
	void showBasicInfo() {
		super.showBasicInfo();
		System.out.println("직   업 : " + job);
	}
	*/
	
	@Override
	void showData() {		
		super.showBasicInfo();
		System.out.println("직   업 : " + job);
	}
}
