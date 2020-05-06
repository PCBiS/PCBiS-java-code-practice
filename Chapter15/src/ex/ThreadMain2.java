package ex;

public class ThreadMain2 {
	public static void main(String[] args) {
		AdderThread at1 = new AdderThread(1L, 25L);
		AdderThread at2 = new AdderThread(26L, 50L);
		AdderThread at3 = new AdderThread(51L, 75L);
		AdderThread at4 = new AdderThread(76L, 100L);
		
		Thread tr1 = new Thread(at1);
		Thread tr2 = new Thread(at2);
		Thread tr3 = new Thread(at3);
		Thread tr4 = new Thread(at4);
		
		tr1.start();
		tr2.start();
		tr3.start();
		tr4.start();
		
		try {
			tr1.join();
			tr2.join();
			tr3.join();
			tr4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
		System.out.println("1 to 100's Sum result : " + (at1.getNum() + at2.getNum() + at3.getNum() + at4.getNum() ));
	}
}
