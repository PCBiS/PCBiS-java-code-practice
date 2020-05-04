package operator;

public class BinaryOperatorPi {
	public static void main(String[] args) {
		/*
			float pi = 3.141592f;
			float shortPi = (int)(pi * 1000) / 1000f;
		 	(int)(3.141592f * 1000) / 1000f;
		 	(int)(3141.592f) / 1000f;
		 	3141 / 1000f;
		 	3.141f -> 최종결과		 
		 */
		
		float pi = 3.141592f;
		int result = (int)(pi * 100f); // pi(float)*100(float) = 314.1592f -> int(314.1592f) = 314 
		System.out.println(result); // 결과는
		
		result = Math.round(pi*100); // Math.round 안에 들어가는건 float 뿐이기 때문에 굳이 변환 안해도 됨. 
		System.out.println(result); // 둘 다 같음.
	
		}
}
