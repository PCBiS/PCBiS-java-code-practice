package ex;

public class AccessThread extends Thread {
	TwoNum tNum;
	
	public AccessThread(TwoNum twoNum) {
		this.tNum = twoNum;
	}
	
	@Override
	public void run() {
		tNum.addOneNum1();
		tNum.addOneNum2();
		
		tNum.addTwoNum1();
		tNum.addTwoNum2();
	}
	
	
}
