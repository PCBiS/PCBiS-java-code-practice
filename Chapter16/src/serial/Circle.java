package serial;

import java.io.Serializable;

public class Circle implements Serializable {
	int xPos;
	int yPos;
	double rad;
	
	public Circle(int x, int r, double r) {
		this.xPos = x;
		this.yPos = y;
		this.rad = r;
	}
}
