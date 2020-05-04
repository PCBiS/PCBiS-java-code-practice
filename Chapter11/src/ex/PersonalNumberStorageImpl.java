package ex;

//public class PersonalNumberStorageImpl extends PersonalNumberStorage 
public class PersonalNumberStorageImpl /* extends Object 기본적으로 생략되있음. */ implements PersonalNumber{
	
	PersonalNumInfo[] perArr;
	int numOfPerInfo;
	String result;
	
	public PersonalNumberStorageImpl(int num) {
		perArr = new PersonalNumInfo[num];
		numOfPerInfo = 0;
	}

	@Override
	public void addPersonalInfo(String perNum, String name) {
		perArr[numOfPerInfo] = new PersonalNumInfo(name, perNum);
		numOfPerInfo++;

	}

	@Override
	public String searchName(String perNum) {
		for (int i = 0; i < numOfPerInfo; i++) {
			if (perArr[i].getNumber().equals(perNum)) {
				result = perArr[i].getName();
			}
		}		
		return result;
	}

}
