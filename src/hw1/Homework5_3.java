package hw1;

public class Homework5_3 {
	public int maxElement(int x[][]) {
		int a = 0;
		for (int i = 0; i < x.length; i++) {
			abort: for (int j = 0; j < x[i].length; j++) {
				if (a < x[i][j]) {
					a = x[i][j];
				} else {
					continue abort;
				}
			}
		}
		return a;
	}

	public double maxElement(double x[][]) {
		double a = 0;
		for (int i = 0; i < x.length; i++) {
			abort: for (int j = 0; j < x[i].length; j++) {
				if (a < x[i][j]) {
					a = x[i][j];
				} else {
					continue abort;
				}
			}
		}
		return a;
	}
}
