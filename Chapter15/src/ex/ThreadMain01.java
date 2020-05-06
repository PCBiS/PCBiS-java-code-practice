package ex;

public class ThreadMain01 {
	public static void main(String[] args) {
		ShowThread tr1 = new ShowThread("Thread01");
		ShowThread tr2 = new ShowThread("Thread02");
		ShowThread tr3 = new ShowThread("Thread03");
		ShowThread tr4 = new ShowThread("Thread04");
		
		tr1.setPriority(Thread.MIN_PRIORITY);
		tr4.setPriority(Thread.MAX_PRIORITY);
		
		tr1.start();
		tr2.start();
		tr3.start();
		tr4.start();
		
		/*
		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread");
		}
		*/
		
	}
}
