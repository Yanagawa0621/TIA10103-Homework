package hw1;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int b = 0;	//總和
		int d = 0;	//陣列長
		for (int c = 0; c < a.length; c++) {
			b = b + a[c];
			d++;
			}
		int e = b / d;	//平均值
		for (int c = 0; c < a.length; c++) {
			if(e<a[c]) {
				System.out.print("a["+c+"]"+"\t");
				System.out.println(a[c]);
			}
		}
			System.out.println("平均值為" + e);
//================================================================================================
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入一字串：");
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
//		int b = sc.nextInt();
//		int e = 0;
//		int a[][] = new int[50][1];
//		System.out.print("有錢可以借的有");
//		a[25][0] = 2500;
//		a[32][0] = 800;
//		a[8][0] = 500;
//		a[19][0] = 1000;
//		a[27][0] = 1200;
//		for (int c = 0; c < a.length; c++) {
//			for (int d = 0; d < a[c].length; d++) {
//				if (b <= a[c][d]) {
//					e++;
//					System.out.print(c + " ");
//				}
//			}
//		}
//		System.out.println("共" + e + "人!");
//=================================================================================================
//		Scanner sc = new Scanner(System.in);
//		System.out.println("請輸入西元");
//		int a = sc.nextInt();
//		System.out.println("請輸入月");
//		int b = sc.nextInt();
//		System.out.println("請輸入日");
//		int c = sc.nextInt();
//		int e[][] = { { 0 }, { 31 }, { 29 }, { 31 }, { 30 }, { 31 }, { 30 }, { 31 }, { 31 }, { 30 }, { 31 }, { 30 },
//				{ 31 } };
//		int g = 0; // 總天數
//		if (a % 4 == 0) {
//			if (c <= e[b][0]) {
//				for (int h = 0; h < b; h++) {
//					g = g + e[h][0];
//				}
//				System.out.println("輸入的日期為該年的第" + (g + c) + "天");
//			} else {
//				System.out.println("日期輸入錯誤");
//			}
//		} else {
//			if (c > e[b][0] || ((b == 2) && (c > e[2][0] - 1))) {
//				System.out.println("日期輸入錯誤");
//			} else if (b == 2) {
//				for (int h = 0; h < b; h++) {
//					g = g + e[h][0];
//				}
//				System.out.println("輸入的日期為該年的第" + (g + c) + "天");
//			} else {
//				for (int h = 0; h < b; h++) {
//					g = g + e[h][0];
//				}
//				g = g - 1;
//				System.out.println("輸入的日期為該年的第" + (g + c) + "天");
//			}
//		}
//=================================================================================================
//		int a[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
//				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 87, 60, 75, 85, 89 },
//				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
//		int num1=0;int num2=0;int num3=0;int num4=0;int num5=0;int num6=0;int num7=0;int num8=0;
//		for(int b=0;b<a.length;b++) {
//			int maxNum=0;
//			int d=0;
//			for(int c=0;c<a[b].length;c++) {
//				if(maxNum<a[b][c]) {
//					maxNum=a[b][c];
//					d=c;
//				}
//			}
//			switch(d) {
//			case 0:
//				++num1;
//				break;
//			case 1:
//				++num2;
//				break;
//			case 2:
//				++num3;
//				break;
//			case 3:
//				++num4;
//				break;
//			case 4:
//				++num5;
//				break;
//			case 5:
//				++num6;
//				break;
//			case 6:
//				++num7;
//				break;
//			case 7:
//				++num8;
//				break;
//			}
//		}
//		System.out.println("各個考最高分次數:1號"+num1+"次,"+"2號"+num2+"次,"+"3號"+num3+"次,"+"4號"+num4+"次,"+"5號"+num5+"次,"+"6號"+num6+"次,"+"7號"+num7+"次,"+"8號"+num8+"次");
	}
}
