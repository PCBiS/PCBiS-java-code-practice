package objectOrient_and_Instance;

public class TV_Factory {
	public static void main(String[] args) {
		Tv_Function tv1 = new Tv_Function();		
		
		tv1.power = true;
		tv1.channel = 7;
		tv1.channelDown();
		System.out.println(tv1.channel);
	}	
}
