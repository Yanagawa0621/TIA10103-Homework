package Homework6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		re: for (;;) {
			System.out.println("請輸入x的值");
			String x = sc.nextLine();
			System.out.println("請輸入y的值");
			String y = sc.nextLine();
			try {
				myCalculator.setCalculator(x, y);
				System.out.println(x + "的" + y + "次方等於" + myCalculator.getCalculator());
				sc.close();
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
				System.out.println("請從新輸入");
				continue re;
			}
		}
	}
}
