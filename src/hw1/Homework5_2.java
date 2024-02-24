package hw1;

import java.util.Scanner;

public class Homework5_2 {
	public static int randAvg(int x) {
		int rNumbers[] = new int[x];
		int sum = 0;
		for (int a = 0; a < rNumbers.length; a++) {
			rNumbers[a] = (int) (Math.random() * 100);
			System.out.print(rNumbers[a] + ",");
			sum = sum + rNumbers[a];
		}
		return sum / rNumbers.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你想要亂數生成幾個數字");
		int b = sc.nextInt();
		System.out.println("總和平均" + randAvg(b));
	}
}
