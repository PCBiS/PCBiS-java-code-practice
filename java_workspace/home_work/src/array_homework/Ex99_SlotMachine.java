package array_homework;

import java.util.Scanner;

public class Ex99_SlotMachine {
	/*
	 * 슬롯머신 
	 * 		1. 슬롯머신엔 시드머니가 1천원이 있다. 
	 * 		가지고 있는 시드 머니내에서 판돈을 걸 수 있는데 
	 * 		계속 걸고 플레이를 하면서 시드머니가 다 떨어지면 게임이 끝난다. 
	 * 		돈이 다 떨어지면 재시작 여부를 사용자에게 묻고 원하면 다시 시작한다
	 * 		(시드머니 초기화 / 게임 끝.) 
	 * 		
	 * 		2. 슬롯머신의 심볼은 7가지이고 패턴은 5가지이다. 
	 * 			1등은 베팅한 돈의 4배. 
	 * 			2등은 베팅한 돈의 3배 
	 * 			3등은 베팅한 돈의 2배. 
	 * 			4등은 패턴이 2종인데 원금을 돌려 받을 수 있다.
	 *  
	 * 		3. 슬롯머신의 결과는 Wheel을 몇번 랜덤하게 돌렸는가의 기준으로 한다.
	 * 
	 * 선언해야 할 전역변수 시드머니[상수], 거는 판돈[변수] 1등 패턴(1,1,1), 2등 패턴(2,2,2), 3등 패턴(3,3,3)
	 * 4-1등, 4-2등 (패턴 예시 : O, O, X / X, O, O)
	 * 
	 * 선언해야 할 임시변수 슬롯머신 배열 1, 2, 3열을 게임당 무작위 생성.
	 * 
	 */

	public static void main(String[] args) {
		int seedMoney = 1;
		int betMoney;
		int morePlay;
		int temp, j=0;
		int[] slotLine01, slotLine02, slotLine03;		
		
		slotLine01 = new int[7];
		slotLine02 = new int[7];
		slotLine03 = new int[7];
		
		
		// 게임 시드머니가 0원이 될 때까지 반복한다.
		while (seedMoney >= 0) {
			int a,b,c;
			a = (int)Math.random()*6+1;
			b = (int)Math.random()*6+1;
			c = (int)Math.random()*6+1;
			
			//매 게임별로 우선 0~6번 배열에 1~7 값을 채운다.
			for (int i = 0; i < slotLine01.length; i++) {
				slotLine01[i] = i+1;
			}
			for (int i = 0; i < slotLine02.length; i++) {
				slotLine01[i] = i+1;
			}
			for (int i = 0; i < slotLine03.length; i++) {
				slotLine01[i] = i+1;
			}
			
			//System.out.println("슬롯01 : " + slotLine01[0] + " 슬롯02 : " + slotLine02[0] + " 슬롯03 : " + slotLine03[0]);
			
			// 배열을 섞는다.
			
			for (int i = 0; i < 100; i++) { // 1번배열 50번 섞기
				j = (int)Math.random()*6+1;
				temp = slotLine01[0];
				slotLine01[0] = slotLine01[j];
				slotLine01[j] = temp;				
			}
			for (int i = 0; i < 100; i++) { // 2번배열 50번 섞기
				j = (int)Math.random()*6+1;
				temp = slotLine01[0];
				slotLine02[0] = slotLine02[j];
				slotLine02[j] = temp;				
			}
			for (int i = 0; i < 100; i++) { // 3번배열 50번 섞기
				j = (int)Math.random()*6+1;
				temp = slotLine01[0];
				slotLine03[0] = slotLine03[j];
				slotLine03[j] = temp;				
			}
			
			//System.out.println("슬롯01 : " + slotLine01[4] + " 슬롯02 : " + slotLine02[4] + " 슬롯03 : " + slotLine03[4]);
			
			if (slotLine01[a]==1&&slotLine02[b]==1&&slotLine03[c]==1) {
				System.out.println("축하합니다 1등입니다! - 반환되는 당첨금");
			}
			
			seedMoney--;
		}
		/*
		if (seedMoney >= 0) {
			System.out.println("게임을 플레이 할 수 있는 돈이 없습니다.");
			System.out.println("계속해서 플레이 하시겠습니까? : 예(1), 아니오(2)");
			Scanner sc = new Scanner(System.in);
			morePlay = sc.nextInt();
			if (morePlay!=1) {
				System.out.println("게임을 종료합니다.");
			}
		}
		*/		
	}

}
