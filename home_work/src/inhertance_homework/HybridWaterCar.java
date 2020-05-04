package inhertance_homework;

public class HybridWaterCar extends HybridCar{
	int waterGauge = 90;	
	
	public void showCurrGauge() {
		System.out.println("잔여 가솔린 : " + gasolineGauge );
		System.out.println("잔여 전기 : " + electronicGauge );
		System.out.println("잔여 수소 : " + waterGauge);
	}
}
