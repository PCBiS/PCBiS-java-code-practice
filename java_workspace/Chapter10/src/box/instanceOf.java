package box;

public class instanceOf {
	public static void wrapBox(Box box) {
		box.wrap();
	}

	public static void main(String[] args) {
		Box box1=new Box();
		PaperBox box2=new PaperBox();
		GoldPaperBox box3=new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
}
