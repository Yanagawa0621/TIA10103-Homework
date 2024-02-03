package hw1;

public class Homework2 {
	public static void main(String[] args) {
		int n = 0;
		for (int o = 1; o <= 1000; o++) {
			if (o % 2 == 0) {
				n = n + o;
			}
		}
		System.out.println(n);
		System.out.println("==============");// 斷行用
//=======================================================================================
		int b = 1;
		for (int a = 1; a <= 10; a++) {
			b = b * a;
		}
		System.out.println(b);
		System.out.println("==============");// 斷行用
//=======================================================================================
		int c = 1, d = 1;
		while (c <= 10) {
			d = d * c;
			c++;
		}
		System.out.println(d);
		System.out.println("==============");// 斷行用
//=======================================================================================
		int f = 0;
		for (int e = 1; e <= 20; e = e + 2) {
			System.out.print(f = f + e);
			System.out.print(" ");
		}
		System.out.println("");
//============第二種寫法================
		int v = 0;
		for (int e = 1; e <= 100; e = e + 2) {
			if (v >= 100) {
				break;
			} else {
				System.out.print(v = v + e);
				System.out.print(" ");
			}

		}
		System.out.println("");
		System.out.println("==============");// 斷行用
//=======================================================================================
		for (int g = 1; g <= 30; g++) {
			if (g % 10 != 4) {
				System.out.print(g + " ");
			}

		}
		System.out.println("");
		System.out.println("==============");// 斷行用
//=======================================================================================
		for (int h = 10; h >= 1; h--) {
			for (int k = 1; k <= 10; k++) {
				if (h >= k)
					System.out.print(k);

			}
			System.out.println("");
		}
		System.out.println("==============");// 斷行用
//=======================================================================================
		for (int q = 1; q <= 6; q++) {
			switch (q) {
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("BB");
				break;
			case 3:
				System.out.println("CCC");
				break;
			case 4:
				System.out.println("DDDD");
				break;
			case 5:
				System.out.println("EEEEE");
				break;
			case 6:
				System.out.println("FFFFFF");
				break;
			}
		}
//============第二種寫法================
		for (int q = 1; q <= 6; q++) {
			for (int p = 1; p <= 6; p++) {
				if (q == 1 && p <= 1)
					System.out.print("A");
				else if (q == 2 && p <= 2)
					System.out.print("B");
				else if (q == 3 && p <= 3)
					System.out.print("C");
				else if (q == 4 && p <= 4)
					System.out.print("D");
				else if (q == 5 && p <= 5)
					System.out.print("E");
				else if (q == 6 && p <= 6)
					System.out.print("F");
			}
			System.out.println("");
		}
//============第三種寫法================
		int t = 71;
		for (char q = 65; q <= t; q++) {
			for (int r = 65; r <= t; r++) {
				if (q >= r) {
					char s = q;
					System.out.print(s);
				}
			}
			System.out.println("");
		}
		System.out.println("==============");// 斷行用
//=======================================================================================
		// for+while的九九乘法表
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				j++;
			}
			System.out.println();
		}
		System.out.println("==============");// 斷行用
//=======================================================================================
		// for+do while的九九乘法表
		for (int i = 1; i <= 9; i++) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				j++;
			} while (j <= 9);
			System.out.println();
		}
		System.out.println("==============");// 斷行用
//=======================================================================================
		// while+do while的九九乘法表
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
				j++;
			} while (j <= 9);
			i++;
			System.out.println();
		}
	}
}
