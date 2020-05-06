package ex;

public class ShowThread extends Thread {
	String threadName;
	
	public ShowThread(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(threadName);
		}
	}
}
