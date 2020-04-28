package trycatch;

public class AgeInputExeception extends Exception {
	public AgeInputExeception() {
		super("유효하지 않은 나이가 입력 되었습니다.");
	}
}
