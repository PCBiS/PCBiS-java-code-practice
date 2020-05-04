package class_homework;
//객체 : 영희, 철수, 구슬
//속성(상태값) : 구슬의 개수
//기능 : 게임, 게임을 통해 구슬을 주고 받는 기능

public class Ex02_Boy {
	int numOfMarble;
		
	Ex02_Boy() {
		this(10);
	}

	Ex02_Boy(int num) {
		numOfMarble = num;
	}

	void setMarble(int num) {
		numOfMarble = num;
	}

	void gameWin(Ex02_Boy boy, int num) {
		numOfMarble += num; // 호출한 측의 플레이어의 구슬을 증가하고
		boy.numOfMarble -= num; // 감소시킬측의 플레이어의 구슬을 감소
	}

	void showData() {
		System.out.println("현재 보유한 구슬의 개수 : " + numOfMarble + "개 입니다.");
	}

	public static void main(String[] args) {
		// 플레이어 두명 생성(영희, 철수)
		Ex02_Boy boy1 = new Ex02_Boy();
		Ex02_Boy boy2 = new Ex02_Boy();
		// 플레이어에게 각각 구슬 기본 보유수치를 설정.
		boy1.setMarble(15);
		boy2.setMarble(9);
		// 정상적으로 보유중인지 테스트
		boy1.showData();
		boy2.showData();
		// 철수(boy1)이 영희를 이긴걸로 간주하고 구슬 2개 얻은것으로 함.
		System.out.println("철수가 이겨서 구슬 2개를 획득하였습니다.");
		boy1.gameWin(boy2, 2); // boy1 이 boy2의 구슬 2개를 가져옴
		// 정상적 거래가 이루어졌는지 확인
		boy1.showData();
		boy2.showData();
		// 영희(boy2)가 철수를 이긴걸로 간주하고 구슬 7개 얻은것으로 함.
		boy2.gameWin(boy1, 7); // boy1 이 boy2의 구슬 2개를 가져옴
		// 정상적 거래가 이루어졌는지 확인
		boy1.showData();
		boy2.showData();

	}

}
