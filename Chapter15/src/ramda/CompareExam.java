package ramda;

public class CompareExam {
	
	
	public static void exec(Compare comp) {
		int k=10;
		int m=20;
		int val = comp.compareTo(k, m);
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		exec((k,m) -> { return k-m; });
	}


}
