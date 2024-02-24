package hw1;

public class Homework5_3_main {
	public static void main(String[] args) {
		int[][] intArray= {{1,6,3},{9,5,2}};
		double[][] doubleArray= {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		Homework5_3 w=new Homework5_3();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}
}
