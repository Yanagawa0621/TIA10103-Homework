package Homework6;

public class Calculator {
	private int x;
	private int y;

	public Calculator() {
	}

	public Calculator(int x, int y) throws CalException {
		setCalculator(x, y);
	}

	void setCalculator(int x, int y) throws CalException {
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義!");
		} else if (y < 0) {
			throw new CalException("次方為負值,結果回傳不為整數!");
		} else {
			this.x = x;
			this.y = y;
		}
	}

	double getCalculator() {

		return Math.pow(x, y);
	}
}
