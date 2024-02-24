package hw1;

public class Homework5_4_MyRectangle {
	private double widrh,depth;
	public Homework5_4_MyRectangle() {
	}
	public Homework5_4_MyRectangle(double widrh,double depth) {
		setWidth(widrh);
		setDepth(depth);
	}
	void setWidth(double widrh) {
		this.widrh=widrh;
	}
	void setDepth(double depth) {
		this.depth=depth;
	}
	double getArea() {
		return widrh*depth;
	}
}
