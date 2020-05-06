package ex;

public class MainThread05 {

	public static void main(String[] args) {
		TwoNum tNum = new TwoNum();
		AccessThread at1 = new AccessThread(tNum);
		AccessThread at2 = new AccessThread(tNum);
		
		at1.start();
		at2.start();
		
		try {
			at1.join();
			at2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tNum.showNums();
	}
}
