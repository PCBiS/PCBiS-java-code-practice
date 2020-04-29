package home_project05_02;

/*
 * 0.5 Ver 특이사항.
 * 
 * 1. 문제 요구사항대로 변수 부분은 추상변수로 이동했음.
 * 	  스캐너 영역은 밖으로 나갈 수 없었기 때문에 그 안에 들어갔음.
 */

public abstract class InfoControllerAbstract {
	String name;
	String phoneNumber;
	String address;
	String email;
	String birthDay;
	String company;
	String major;
	String year;
	String clubNickName;
	String clubRole;
	PhoneInfor[] pInfo;	// PhoneInfor 클래스 형태의 배열 생성
	int pIdx; // PhoneInfor를 통제할 기초 index 값 생성.
	
	
	//infoController 에서 구현을 해야 할 필요성이 있는 기능을 추상클래스로 구현
	abstract void addInfo(int type);
	abstract void modifyInfo(int type, int pIdx);
	abstract void infoSearch(String searchWord);
	abstract void infoDelete(String searchWord);
	abstract void infoModify(String searchWord);
	abstract void showList(int type);
}
