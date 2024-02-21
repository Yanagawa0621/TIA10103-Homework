package hw1;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
//		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
//		int b = 0;	//總和
//		int d = 0;	//陣列長
//		for (int c = 0; c < a.length; c++) {
//			b = b + a[c];
//			d++;
//			}
//		int e = b / d;	//平均值
//		System.out.println("平均值為" + e);
//		System.out.println("大於平均值的有:");
//		for (int c = 0; c < a.length; c++) {
//			if(e<a[c]) {
//				System.out.print("a["+c+"]"+"\t");
//				System.out.println(a[c]);
//			}
//		}
//================================================================================================
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入一串文字：");
//		String a=sc.nextLine();
//		int b= a.length();	//字串長
//		
//		//將字串一個個裝進字元陣列
//		char[] d=new char[b];	
//		for(int c=0;c<b;c++) {
//			d[c]=a.charAt(c);
//		}
//		
//		//倒著將字元一個一個印出
//		for(--b;b>=0&&b<d.length;b--) {
//			System.out.print(d[b]);
//		}
//=================================================================================================
//		String[] a = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		int d = 0;
//		for (int b = 0; b < a.length; b++) {
//			for (int c = 0; c < a[b].length(); c++) {
//				char f = a[b].charAt(c);
//				if ((f == 'a') || (f == 'e') || (f == 'i') || (f == 'o') || (f == 'u')) {
//					d = d + 1;
//				}
//			}
//		}
//		System.out.println(d+"個母音");
//=================================================================================================
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入你想借的金額");
//		int loan = sc.nextInt();
//		int e = 0; // 人數
//		int a[][] = new int[50][1];
//		System.out.print("有錢可以借的有");
//		a[25][0] = 2500;
//		a[32][0] = 800;
//		a[8][0] = 500;
//		a[19][0] = 1000;
//		a[27][0] = 1200;
//		for (int c = 0; c < a.length; c++) {
//			for (int d = 0; d < a[c].length; d++) {
//				if (loan <= a[c][d]) {
//					e++;
//					System.out.print(c + " ");
//				}
//			}
//		}
//		System.out.println("");
//		System.out.println("共" + e + "人!");
//=================================================================================================
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入西元");
//		int ad = sc.nextInt();
//		System.out.println("請輸入月");
//		int month = sc.nextInt();
//		System.out.println("請輸入日");
//		int date = sc.nextInt();
//		int everyMonth[] = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		int g = 0; // 總天數
//
//		if (month <= 12) {
//			if (ad % 4 == 0) { // 閏年的計算
//				if (date <= everyMonth[month]) {
//					for (int h = 0; h < month; h++) {
//						g = g + everyMonth[h];
//					}
//					System.out.println("輸入的日期為該年的第" + (g + date) + "天");
//				} else {
//					System.out.println("日期輸入錯誤");
//				}
//			} else { // 非閏年的計算
//				if (date > everyMonth[month] || ((month == 2) && (date > everyMonth[2] - 1))) {
//					System.out.println("日期輸入錯誤");
//				} else if (month == 2) { // 非閏年2月獨立計算
//					for (int h = 0; h < month; h++) {
//						g = g + everyMonth[h];
//					}
//					System.out.println("輸入的日期為該年的第" + (g + date) + "天");
//				} else { // 非閏年除了2月之外的各個月計算
//					for (int h = 0; h < month; h++) {
//						g = g + everyMonth[h];
//					}
//					g = g - 1;
//					System.out.println("輸入的日期為該年的第" + (g + date) + "天");
//				}
//			}
//		} else {
//			System.out.println("月份輸入錯誤");
//		}
//=================================================================================================
		int a[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 87, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0;

		// 找出各個陣列裡最大的值的位置
		for (int b = 0; b < a.length; b++) {
			int maxNum = 0;
			int d = 0;
			for (int c = 0; c < a[b].length; c++) {
				if (maxNum < a[b][c]) {
					maxNum = a[b][c];
					d = c;
				}
			}

			// 將各個位置出現的次數計算
			switch (d) {
			case 0:
				++num1;
				break;
			case 1:
				++num2;
				break;
			case 2:
				++num3;
				break;
			case 3:
				++num4;
				break;
			case 4:
				++num5;
				break;
			case 5:
				++num6;
				break;
			case 6:
				++num7;
				break;
			case 7:
				++num8;
				break;
			}
		}
		System.out.println("各個考最高分次數:1號" + num1 + "次," + "2號" + num2 + "次," + "3號" + num3 + "次," + "4號" + num4 + "次,"
				+ "5號" + num5 + "次," + "6號" + num6 + "次," + "7號" + num7 + "次," + "8號" + num8 + "次");
	}
}
