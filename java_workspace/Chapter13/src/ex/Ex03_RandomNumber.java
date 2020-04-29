package ex;

import java.util.Random;

public class Ex03_RandomNumber {
	public static void main(String[] args) {
		Random rand = new Random(System.nanoTime());
		for (int i = 0; i < 6; i++) {
			//System.out.println(rand.nextBoolean());
			System.out.println(rand.nextInt(45+1));
			//System.out.println(rand.nextDouble());
		}
	}
}
