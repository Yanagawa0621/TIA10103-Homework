package Homework6;

public class Calculator {
	private int a;
	private int b;

	public Calculator() {
	}

	public Calculator(String a, String b) throws CalException {
		setCalculator(a, b);
	}

	void setCalculator(String a, String b) throws CalException {
		try {
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			if (x == 0 && y == 0) {
				throw new CalException("0的0次方沒有意義!");
			} else if (y < 0) {
				throw new CalException("次方為負值,結果回傳不為整數!");
			} else {
				this.a = x;
				this.b = y;
			}
		} catch (NumberFormatException e) {
			throw new CalException("輸入格式不正確,請輸入整數");
		}
	}

	double getCalculator() {

		return Math.pow(a, b);
	}
}
