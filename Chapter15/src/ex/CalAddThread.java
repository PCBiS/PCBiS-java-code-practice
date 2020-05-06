package ex;

public class CalAddThread extends Thread {
	Calculator cal;
	
	public CalAddThread(Calculator c) {
		cal = c;
	}
	
	@Override
	public void run() {
		System.out.println("add : " + cal.add(5, 10));
		System.out.println("add : " + cal.add(10, 10));
	}
	
	
}
