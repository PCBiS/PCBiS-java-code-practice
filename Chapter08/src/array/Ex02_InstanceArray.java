package array;

public class Ex02_InstanceArray {
	public static void main(String[] args) {
		//인스턴스 생성
		String[] strArr = new String[3];

		strArr[0] = "JAVA"; // 인스턴스의 주소 값에 각 주소값을 입력.
		strArr[1] = "JavaScript";
		strArr[2] = "Python";		
		
		System.out.println("문자열의 길이 : " + strArr.length);
		System.out.println("문자열의 toStrij : " + strArr.length);

		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}