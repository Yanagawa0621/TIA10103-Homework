package hw1;

import java.util.Scanner;

public class Homework5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬");
		int width = sc.nextInt();
		if (width > 0) {
			System.out.println("請輸入高");
			int height = sc.nextInt();
			if (height >= 0) {
				starSquare(width, height);
				System.out.println("寬:" + width + ",高:" + height);
			} else {
				System.out.println("輸入錯誤,請輸入大於0的數字");
			}
		} else {
			System.out.println("輸入錯誤,請輸入正整數");
		}
	}

	public static void starSquare(int width, int height) {
		for (int a = 0; a <= height; a++) {
			for (int b = 0; b < width; b++) {
				System.out.print("*");
			}
			System.out.println("\t");
		}
	}
}
