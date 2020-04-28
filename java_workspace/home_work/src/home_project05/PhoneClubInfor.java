package home_project05;

public class PhoneClubInfor extends PhoneInfor {
	private String clubNickName;	// 클럽 내 활동명
	private String clubRole;			// 클럽 내 직위
	
	public PhoneClubInfor(String name, String phoneNumber, String address, String email, String birthDay, String clubNickName, String clubRole) {
		super(name, phoneNumber, address, email, birthDay);
		this.clubNickName = clubNickName;
		this.clubRole = clubRole;
	}

	@Override
	public void allInfo() {		
		super.allInfo();
		System.out.println("닉 네  임 : " + clubNickName);
		System.out.println("직     위 : " + clubRole);
	}
}
