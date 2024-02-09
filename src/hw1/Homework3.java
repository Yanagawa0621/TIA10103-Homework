package hw1;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
//=================================================================================
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個數字來組成三角形");
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double as = Math.pow(a, 2);
		double bs = Math.pow(b, 2);
		double cs = Math.pow(c, 2);
		if ((a + b > c && a + c > b) && c + b > a) {
			if (((as + bs == cs) || as + cs == bs) || bs + cs == as) {
				System.out.print(a + " " + b + " " + c + " " + "\t");
				System.out.println("這是直角三角形");
			} else if (((a == b || c == b) || a == c) && ((a % b != 0 || c % b != 0) || a % c != 0)) {
				System.out.print(a + " " + b + " " + c + " " + "\t");
				System.out.println("這是等腰三角形");
			} else if (a == b && b == c) {
				System.out.println(a + " " + b + " " + c + " " + "\t");
				System.out.println("這是正三角形");
			} else {
				System.out.println(a + " " + b + " " + c + " " + "\t");
				System.out.println("這是其他三角形");
			}
		} else
			System.out.println("輸入錯誤，無法組成三角形");
//=================================================================================
//		int d = (int) (Math.random() * 100);
//		again: 
//		while (true) {
//			System.out.println("開始猜數字吧!");
//			int e = sc.nextInt();
//			if ((e != d) && (e > d)) {
//				System.out.println("猜錯囉!答案小於" + e);
//				continue again;
//			} else if ((e != d) && (e < d)) {
//				System.out.println("猜錯囉!答案大於" + e);
//				continue again;
//			} else
//				System.out.println("答對了!答案就是" + d);
//			break;
//		}
//=================================================================================
//		System.out.println("阿文...請輸入你討厭的數字(1~9)");
//		int g = sc.nextInt();
//		int[] k = new int[6];
//		if (g != 0 && g <= 9) {
//
//			// 印出6個數字
//			for (int i = 0; i < 6; i++) {
//				re: while (true) {
//
//					// 隨機取出1個數字
//					int h = (int) (Math.random() * 49) + 1;
//
//					// 判斷個位數g跟二位數尾數為g的數自及後續數字不重複
//					if ((h % 10 != g) && (h != k[0]) && (h != k[1]) && (h != k[2]) && (h != k[3]) && (h != k[4])
//							&& (h != k[5])) {
//
//						// 判斷二位數開頭非為g的數字
//						if ((g * 10) > h || (g * 10) + 9 < h) {
//							k[i] = h;
//							System.out.print(h + "\t");
//							break;
//						} else {
//							continue re; // 沒有拿到符合的數字所以回到前一個迴圈重新取的新的數字
//						}
//					} else {
//						continue re; // 沒有拿到符合的數字所以回到前一個迴圈重新取的新的數字
//					}
//				}
//			}
//		} else
//			System.out.println("輸入錯誤，請輸入1~9之間的數字");
	}

}
