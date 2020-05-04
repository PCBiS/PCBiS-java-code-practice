package inhertance_homework;

public class CarGauge {
	public static void main(String[] args) {
		HybridWaterCar[] cars = (HybridWaterCar[]) new Car[3];
		cars[0] = (HybridWaterCar) new Car();
		cars[1] = (HybridWaterCar) new HybridCar();
		cars[2] = new HybridWaterCar();	
		
		cars[0].showCurrGauge();
		
	}
}
