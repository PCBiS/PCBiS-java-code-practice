package home_project03;

public class PhoneBook{
		
	private String userName;
	private String phoneNum;
	private String birthDay;	
	
	public PhoneBook(String uName, String uPhone, String uBirth) {		
		this.userName = uName;
		this.phoneNum = uPhone;
		this.birthDay = uBirth;
	}
	
	public void showPhoneBook() {
		System.out.println("이    름 : " + userName);
		System.out.println("전화번호 : " + phoneNum);
		System.out.println("생년월일 : " + birthDay);
	}
	
	public boolean searchName(String name) {
		return this.userName.equals(name);
	}
	
}
