package hw1;

public class Homework5_4_MyRectangleMain {
	public static void main(String[] args) {
		Homework5_4_MyRectangle a=new Homework5_4_MyRectangle();
		a.setWidth(10.0);
		a.setDepth(20.0);
		System.out.println(a.getArea());
		Homework5_4_MyRectangle b=new Homework5_4_MyRectangle(10.0,20.0);
		System.out.println(b.getArea());
	}
}
