package ex;

public class ThreadMain04 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		CalAddThread add = new CalAddThread(cal);
		CalMinThread min = new CalMinThread(cal);
		
		add.start();
		min.start();
		
		try {
			add.join();
			min.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		cal.showOpCnt();
	}
}
