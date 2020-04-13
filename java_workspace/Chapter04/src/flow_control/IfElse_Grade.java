package flow_control;

public class IfElse_Grade {
	public static void main(String[] args) {
		int score = 99;
		String grade = "";
		String grade2 = "";
		/*
		 * 점수를 기준으로 A+, A, A-, B+, B, B-, C
		
		 * 상세한 점수 기준표는
		 * 100 ~ 98 : A+
		 * 97 ~ 94 : A
		 * 93 ~ 90 : A-  
		 */
		
		if (score >= 90) { //기본적으로 90 일 때 A를 부여
			grade = "A";
			if (score >= 98) { // 그 중에서도 98점 이상은 +을 부여
				grade += "+"; // grade = grade + "+"
			}else if (score < 94) { // 94점 미만은 -를 부여
				grade += "-"; // grade = grade + "-"
			}
		} else if (score >=80) {
			grade = "B";
			if (score >= 88) { // 그 중에서도 88점 이상은 +을 부여
				grade += "+"; // grade = grade + "+"
			}else if (score < 88) { // 88점 미만은 -를 부여
				grade += "-"; // grade = grade + "-"
			}
		} else {
			grade2 = "C";
		}		
		//위 if문 조건식을 삼항연산자로 변환 했을 때
		if (score >= 90) {
			grade2 = "A";
				grade2 += (score >= 98) ? grade2+="+" : (score >= 94) ? grade2+="" : grade2+"-"; 
		}else if (score >= 80) {
			grade2 = "B";
				grade2 += (score >= 88) ? grade2+="+" : grade2+"-";
		}else {
			grade2 = "C";
		}
		
		System.out.println(grade);
		System.out.println(grade2);
		
	}
}
