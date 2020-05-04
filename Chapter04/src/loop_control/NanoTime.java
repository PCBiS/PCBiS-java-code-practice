package loop_control;

public class NanoTime {
	public static void main(String[] args) {
		long startTime = System.nanoTime();		
		for (int i = 0; i < 1000000; i++) {
			System.out.println(1 * 1 * Math.PI);
		}
		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("걸린 시간 : " + estimatedTime / 1000000000.0 + " milli seconds");
	}
}
