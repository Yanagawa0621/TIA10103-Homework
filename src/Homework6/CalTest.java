package Homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args){
		Calculator myCalculator = new Calculator();
		re: for (;;) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值");
				int x = sc.nextInt();
				re2: for (;;) {
					try {
						Scanner sc2 = new Scanner(System.in);
						System.out.println("請輸入y的值");
						int y = sc2.nextInt();
						try {
							myCalculator.setCalculator(x, y);
							System.out.println(x + "的" + y + "次方等於" + myCalculator.getCalculator());
							sc2.close();
							sc.close();
							break re;
						} catch (Exception e) {
							System.out.println(e.toString());
							System.out.println("請從新輸入");
							continue re;
						}
					} catch (InputMismatchException a) {
						System.out.println(a.toString()+":輸入格式不正確");
						System.out.println("請從新輸入y的值");
						continue re2;
					}
				}
			} catch (InputMismatchException b) {
				System.out.println(b.toString()+":輸入格式不正確");
				System.out.println("請從新輸入x的值");
				continue re;
			}
		}
	}
}
