package home_project06;

import java.util.ArrayList;

/*
 * 0.6 Ver 특이사항.
 * 
 * pInfo를 기존에는 배열 타입으로 선언하였으나
 * 현재 버전에서는 ArrayList 타입으로 변경하였음.
 * 그러한 이유로 배열에 저장된 요소의 크기를 카운트 해주던 pIdx값이 필요 없어짐. 
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
	ArrayList<PhoneInfor> pInfo;	// PhoneInfor 클래스 형태의 배열 생성
	//int pIdx; // PhoneInfor를 통제할 기초 index 값 생성.
	
	
	//infoController 에서 구현을 해야 할 필요성이 있는 기능을 추상클래스로 구현
	abstract void addInfo(int type);
	abstract void modifyInfo(int type, int pIdx);
	abstract void infoSearch(String searchWord);
	abstract void infoDelete(String searchWord);
	abstract void infoModify(String searchWord);
	abstract void showList(int type);
}
