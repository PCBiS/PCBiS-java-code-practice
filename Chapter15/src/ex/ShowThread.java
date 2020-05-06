package ex;

public class ShowThread extends Thread {
	String threadName;
	
	public ShowThread(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				System.out.println(threadName);
				System.out.println(Thread.currentThread());
				Thread.sleep(250);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}
