package friend;

public class HighFriend extends Friend implements Info {
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

	public void showData() {		
		super.showBasicInfo();
		System.out.println("직   업 : " + job);
	}
}
