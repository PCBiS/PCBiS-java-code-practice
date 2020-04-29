package ex;

public class Ex01_Wrapper {
	public static void main(String[] args) {
		Integer i = new Integer(100);
		Integer i2 = new Integer("100");
		
		System.out.println(i + " " + i2);
		System.out.println(" i1 == i2 " + (i == i2));
		System.out.println("i1 equals i2 = " + i.equals(i2));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.BYTES + "byte");
		System.out.println(Integer.SIZE + "bit");
				
	}
}
