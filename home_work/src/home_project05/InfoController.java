package home_project05;

import java.io.IOException;
import java.util.Scanner;

/*
 * 컨트롤러에 필요 한 기능
 * 
 * 정보 추가. 
 * 	- 파생기능 : 정보 수정. - 구현완료
 * 기본 정보 보기.	- 구현 완료
 * 전체 정보 보기.	- 구현 완료
 * 정보 검색. (이름을 기준으로)
 * 정보 삭제. (정보 검색과 동일한 로직으로.)
 * 
 */

public class InfoController extends InfoControllerAbstract implements AddInterface {
		
	private Scanner sc;	
		
	private InfoController() {
		this.pInfo = new PhoneInfor[100]; // 배열 크기는 100개.
		this.pIdx = 0; // 숫자는 0 to 99(100개), 이 이상 증가하려고 하면 막는 로직이 존재해야 함.			
		this.sc = new Scanner(System.in); // 스캐너는 한개만 만들어서 가급적 재활용.		
	}
	
	private static InfoController info = new InfoController();
	
	public static InfoController getInstance() {
		return info;
	}	
	
	
	// 이하 공개 된 기능이자 추상화 된 기능을 상세하게 구현 한 것들.
	
	@Override
	public void showList(int type) {
		if (type==1) {
			showInfoList(pInfo, type);
		}else if (type==2) {
			showInfoList(pInfo, type);
		}
	}
	
	@Override
	public void addInfo(int type) {		
		System.out.println("사용자 정보를 입력받습니다.");					
		System.out.println("이름을 입력해주세요 : ");
		this.name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요 : ");
		this.phoneNumber = sc.nextLine();
		System.out.println("주소를 입력해주세요 : ");
		this.address = sc.nextLine();
		System.out.println("이메일 주소를 입력해주세요 : ");
		this.email = sc.nextLine();
		System.out.println("생년월일을 입력해주세요 : ");
		this.birthDay = sc.nextLine();
		switch (type) {
			case 1:
				System.out.println("회사명을 입력해주세요 : ");
				this.company = sc.nextLine();							
				addCorpInfo(this.name, this.phoneNumber, this.address, this.email, this.birthDay, this.company);				
				break;
			case 2:
				System.out.println("전공을 입력해주세요 : ");
				this.major = sc.nextLine();					
				System.out.println("학년을 입력해주세요 : ");
				this.year = sc.nextLine();							
				addUnivInfo(this.name, this.phoneNumber, this.address, this.email, this.birthDay, this.major, this.year);				
				break;
			case 3:
				System.out.println("닉네임을 입력하세요.");
				this.clubNickName = sc.nextLine();
				System.out.println("직위를 입력하세요.");
				this.clubRole = sc.nextLine();
				addClubInfo(this.name, this.phoneNumber, this.address, this.email, this.birthDay, this.clubNickName, this.clubRole);
				break;
			case 4:				
				addBaseInfo(this.name, this.phoneNumber, this.address, this.email, this.birthDay);
				break;
			}
		System.out.println("사용자 등록이 정상적으로 완료 되었습니다.");
		System.out.println("============================================");
		System.out.println("엔터를 입력하시면 처음 화면으로 돌아갑니다.");
		try { System.in.read(); } catch (IOException e) { e.printStackTrace();} // 키보드 입력이 진행 될 때 까지 잠시 멈춤.

	}
	
	@Override
	public void modifyInfo(int type, int pIdx) {		
		System.out.println("사용자 정보를 입력받습니다.");					
		System.out.println("이름을 입력해주세요 : ");
		this.name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요 : ");
		this.phoneNumber = sc.nextLine();
		System.out.println("주소를 입력해주세요 : ");
		this.address = sc.nextLine();
		System.out.println("이메일 주소를 입력해주세요 : ");
		this.email = sc.nextLine();
		System.out.println("생년월일을 입력해주세요 : ");
		this.birthDay = sc.nextLine();
		switch (type) {
			case 1:
				System.out.println("회사명을 입력해주세요 : ");
				this.company = sc.nextLine();							
				addCorpInfo(this.name, this.phoneNumber, this.address, this.email, this.birthDay, this.company, pIdx);				
				break;
			case 2:
				System.out.println("전공을 입력해주세요 : ");
				this.major = sc.nextLine();					
				System.out.println("학년을 입력해주세요 : ");
				this.year = sc.nextLine();							
				addUnivInfo(this.name, this.phoneNumber, this.address, this.email, this.birthDay, this.major, this.year, pIdx);				
				break;
			case 3:
				System.out.println("닉네임을 입력하세요.");
				this.clubNickName = sc.nextLine();
				System.out.println("직위를 입력하세요.");
				this.clubRole = sc.nextLine();
				addClubInfo(this.name, this.phoneNumber, this.address, this.email, this.birthDay, this.clubNickName, this.clubRole, pIdx);
				break;
			case 4:
				addBaseInfo(this.name, this.phoneNumber, this.address, this.email, this.birthDay, pIdx);
				break;
			}
		System.out.println("사용자 등록이 정상적으로 완료 되었습니다.");
		System.out.println("============================================");
		System.out.println("엔터를 입력하시면 처음 화면으로 돌아갑니다.");
		try { System.in.read(); } catch (IOException e) { e.printStackTrace();} // 키보드 입력이 진행 될 때 까지 잠시 멈춤.

	}
	
	@Override
	public void infoSearch(String searchWord) {
		int findIdx = -1;
		if (pIdx<1) {System.out.println("사용자가 아무도 등록 되어있지 않습니다!");}		
		else{
			findIdx = searchIdx(searchWord);
			if (findIdx<0) {
				System.out.println("검색 결과 일치하는 이름의 사용자를 찾지 못했습니다.");
			}else {
				System.out.println("검색결과, 일치하는 이름을 찾았습니다.");
				System.out.println("해당 사용자명에 해당하는 정보를 출력합니다.");
				System.out.println("============================================");
				pInfo[findIdx].allInfo();
				System.out.println("============================================");
				System.out.println("엔터를 입력하시면 처음 화면으로 돌아갑니다.");
				try { System.in.read(); } catch (IOException e) { e.printStackTrace();} // 키보드 입력이 진행 될 때 까지 잠시 멈춤.
			}		
		}			
	}
	
	@Override
	public void infoDelete(String searchWord) {
		int findIdx = -1;
		if (pIdx<0) {System.out.println("사용자가 아무도 등록 되어있지 않습니다!");}
		else {
			findIdx = searchIdx(searchWord);
			if (findIdx<0) {
				System.out.println("검색 결과 일치하는 이름의 사용자를 찾지 못했습니다.");
			}else {
				System.out.println("검색결과, 일치하는 이름을 찾았습니다.");
				System.out.println("해당 사용자명에 해당하는 정보를 삭제합니다.");
				System.out.println("============================================");				
				for (int i = 0; i < pIdx; i++) {
					pInfo[findIdx] = pInfo[findIdx+1];
				}
				pIdx--;
				System.out.println("============================================");
				System.out.println("엔터를 입력하시면 처음 화면으로 돌아갑니다.");
				try { System.in.read(); } catch (IOException e) { e.printStackTrace();} // 키보드 입력이 진행 될 때 까지 잠시 멈춤.
			}
		}
	}
	
	@Override
	public void infoModify(String searchWord) {
		int findIdx = -1;
		if (pIdx<0) {System.out.println("사용자가 아무도 등록 되어있지 않습니다!");}
		else {
			findIdx = searchIdx(searchWord);
			if (findIdx<0) {
				System.out.println("검색 결과 일치하는 이름의 사용자를 찾지 못했습니다.");
			}else {
				System.out.println("검색결과, 일치하는 이름을 찾았습니다.");
				System.out.println("해당 사용자명에 해당하는 정보를 수정하기 위해 입력 받습니다.");
				System.out.println("============================================");
				if (pInfo[findIdx] instanceof PhoneCorpInfor) {
					modifyInfo(AddInterface.Work, findIdx);
				}else if (pInfo[findIdx] instanceof PhoneUnivInfor) {
					modifyInfo(AddInterface.Univ, findIdx);
				}else if (pInfo[findIdx] instanceof PhoneClubInfor) {
					modifyInfo(AddInterface.Club, findIdx);
				}else if (pInfo[findIdx] instanceof PhoneInfor) {
					modifyInfo(AddInterface.Base, findIdx);
				}	
				
				System.out.println("============================================");
				System.out.println("엔터를 입력하시면 처음 화면으로 돌아갑니다.");
				try { System.in.read(); } catch (IOException e) { e.printStackTrace();} // 키보드 입력이 진행 될 때 까지 잠시 멈춤.
			}
		}
	}
	
	
	
	// 이 아래에 기재하는 코드는 외부로는 보이지 않을 로직. 내부에서만 작동하도록해서 결과값은 public 한 것으로만 출력	
	// 사용자 리스트를 받아서 해당 리스트를 출력 해주는 기능.
	
	private int searchIdx(String keyword) {
		int findIdx =-1;
		for (int i = 0; i < pIdx; i++) {
			if (pInfo[i].searchName(keyword)) {
				findIdx = i;
				break;
			}
		}
		return findIdx;
	}
	
	private void showInfoList(PhoneInfor pInfo[], int select) {		
		// 조상격의 공통되는 전체 정보만을 출력 한다.
		if (this.pIdx<0) {
			System.out.println("저장 된 정보가 없습니다. 처음으로 돌아갑니다.");		
		}else {
			if (select==1) { // select 가 1을 입력받았으면 기본 정보를 입력
				for (int i = 0; i < pIdx; i++) {				
					pInfo[i].basicInfo();
					System.out.println("======================");
				}
				
			}else if(select==2) { // select 가 2를 입력받았으면 모든정보를 출력
				for (int i = 0; i < pIdx; i++) {				
					pInfo[i].allInfo();
					System.out.println("======================");
				}				
			}
			System.out.println("엔터를 입력하시면 처음 화면으로 돌아갑니다.");
			try { System.in.read(); } catch (IOException e) { e.printStackTrace();} // 키보드 입력이 진행 될 때 까지 잠시 멈춤.
		}		
	}	
	
	private void addBaseInfo(String name, String phoneNumber, String address, String email, String birthDay) {
		if (this.pIdx>99) {
			System.out.println("더 이상 저장 할 수가 없습니다. 처음으로 돌아갑니다.");
		}else {			
			this.pInfo[this.pIdx] = new PhoneInfor(name, phoneNumber, address, email, birthDay);			
			pIdx++;
			addComplete();
			}
		}
	
	private void addBaseInfo(String name, String phoneNumber, String address, String email, String birthDay, int pIdx) {
		if (this.pIdx>99) {
			System.out.println("더 이상 저장 할 수가 없습니다. 처음으로 돌아갑니다.");
		}else {
			this.pInfo[pIdx] = new PhoneInfor(name, phoneNumber, address, email, birthDay);			
			addComplete();
			}
		}	
 
	private void addCorpInfo(String name, String phoneNumber, String address, String email, String birthDay, String company) {
		if (this.pIdx>99) {
			System.out.println("더 이상 저장 할 수가 없습니다. 처음으로 돌아갑니다.");
		}else {
			this.pInfo[this.pIdx] = new PhoneCorpInfor(name, phoneNumber, address, email, birthDay, company);
			pIdx++;
			addComplete();
		}
	}
	
	private void addCorpInfo(String name, String phoneNumber, String address, String email, String birthDay, String company, int pIdx) {
		if (this.pIdx>99) {
			System.out.println("더 이상 저장 할 수가 없습니다. 처음으로 돌아갑니다.");
		}else {
			this.pInfo[pIdx] = new PhoneCorpInfor(name, phoneNumber, address, email, birthDay, company);			
			addComplete();
		}
	}
	
	private void addUnivInfo(String name, String phoneNumber, String address, String email, String birthDay, String major, String year) {
		if (this.pIdx>99) {
			System.out.println("더 이상 저장 할 수가 없습니다. 처음으로 돌아갑니다.");
		}else {			
			this.pInfo[pIdx] = new PhoneUnivInfor(name, phoneNumber, address, email, birthDay, major, year);			
			pIdx++;			
			addComplete();
		}
	}
	
	private void addUnivInfo(String name, String phoneNumber, String address, String email, String birthDay, String major, String year, int pIdx) {
		if (this.pIdx>99) {
			System.out.println("더 이상 저장 할 수가 없습니다. 처음으로 돌아갑니다.");
		}else {
			this.pInfo[pIdx] = new PhoneUnivInfor(name, phoneNumber, address, email, birthDay, major, year);			
			addComplete();
		}
	}
	
	private void addClubInfo(String name, String phoneNumber, String address, String email, String birthDay, String clubNickName, String clubRole) {
		if (this.pIdx>99) {
			System.out.println("더 이상 저장 할 수가 없습니다. 처음으로 돌아갑니다.");
		}else {
			this.pInfo[pIdx] = new PhoneClubInfor(name, phoneNumber, address, email, birthDay, clubNickName, clubRole);
			pIdx++;			
			addComplete();
		}
	}
	
	private void addClubInfo(String name, String phoneNumber, String address, String email, String birthDay, String clubNickName, String clubRole, int pIdx) {
		if (this.pIdx>99) {
			System.out.println("더 이상 저장 할 수가 없습니다. 처음으로 돌아갑니다.");
		}else {
			this.pInfo[pIdx] = new PhoneClubInfor(name, phoneNumber, address, email, birthDay, clubNickName, clubRole);						
			addComplete();
		}
	}
	
	private void addComplete() {
		System.out.println("저장이 완료 되었습니다. 메인 화면으로 돌아갑니다.");
	}
}
