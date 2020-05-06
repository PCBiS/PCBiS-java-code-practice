package ex;

public class ThreadMain03 {
	public static void main(String[] args) {
		Sum sum = new Sum();
		
		AddThread ad1 = new AddThread(sum, 1L, 500000L);
		AddThread ad2 = new AddThread(sum, 500001L, 1000000L);
		
		ad1.start();
		ad2.start();
		
		try {
			ad1.join(10000);
			ad2.join(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("ad1 + ad2 = " + sum.getNum());
	}
}
