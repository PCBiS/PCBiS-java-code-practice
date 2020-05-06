package ex;

public class CalMinThread extends Thread {
	Calculator cal;
	
	public CalMinThread(Calculator c) {
		cal = c;
	}
	
	@Override
	public void run() {
		System.out.println("min : " + cal.min(10, 8));
		System.out.println("min : " + cal.min(22, 11));
	}
	
	
}
