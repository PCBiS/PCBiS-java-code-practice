package ex;

public class AddThread extends Thread {
	Sum sumInst;
	Long start;
	Long end;
	
	public AddThread(Sum sum, Long s, Long e) {
		sumInst = sum;
		start = s;
		end = e;		
	}
	
	public void run() {
		for (Long i = start; i <= end; i++) {
			sumInst.addNum(i);
		}
	}
	
}
