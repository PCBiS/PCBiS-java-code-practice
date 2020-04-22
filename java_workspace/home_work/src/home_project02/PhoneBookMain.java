package home_project02;

public class PhoneBookMain {
	public static void main(String[] args) {
		PhoneBookManager manager = new PhoneBookManager();
		Phoneinfor info = null;
		while (true) {
			info = manager.createInstance();
			info.showPbook();
		}
		
	}
}
