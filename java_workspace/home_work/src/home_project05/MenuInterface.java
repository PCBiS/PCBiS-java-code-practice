package home_project05;

public interface MenuInterface {
	
	// 이하 메인 인터페이스 문자열
	
	String FunctionNotification = "원하는 기능을 선택 하세요.";
	String UserAdd = "1. 사용자 추가";
	String UserListView = "2. 사용자 정보 보기";
	String UserSearch = "3. 사용자 검색";
	String UserDelete = "4. 사용자 삭제";
	String UserModify = "5. 사용자 수정";
	String ExitProgram = "6. 프로그램 종료";
	String Catagory = "카테고리를 선택하세요.";
	String InputUserName = " 사용자의 이름을 입력해주세요.";
	String Search = "검색할";
	String Delete = "삭제할";
	String Modify = "수정할";
	String WrongChoice = "잘못 선택 하셨습니다. 다른 번호를 입력하세요.";
	
	// 메인 인터페이스 숫자열
	
	int UserAddNum=1;
	int UserListViewNum=2;
	int UserSearchNum=3;
	int UserDeleteNum=4;
	int UserModifyNum=5;
	int ExitMenuNum=6;
	
	// UserAdd Sub 인터페이스	
	String UserAdd_Catagory = "등록할 " + Catagory;
	String UserAdd_Work = AddInterface.Work + ". 직    장";
	String UserAdd_Univ = AddInterface.Univ + ". 대    학";
	String UserAdd_Club = AddInterface.Club + ". 동 호 회";
	String UserAdd_Base = AddInterface.Base + ". 기    본";
	
	// UserSearch Sub 인터페이스
	String UserSearch_Catagory = "검색 할 " + Catagory;
	String UserSearch_Default = "1. 기 본 정 보";
	String UserSearch_Detail = "2. 상 세 정 보";
}
