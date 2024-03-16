package homework10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class NumericConversion {
	public static void main(String[] args) {
		String regex = "^\\d{0,}\\.{0,}\\d{0,}$";
		Scanner sc = new Scanner(System.in);
		retreat: for (;;) {
			System.out.println("請輸入數字");
			String a = sc.nextLine();
			if (a.matches(regex)) {
				Double number = Double.valueOf(a);
				retreat2: for (;;) {
					System.out.println("輸入數字:" + number);
					System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
					String b = sc.nextLine();
					String regex2 = "^[1-3]$";
					if (b.matches(regex2)) {
						int number2 = Integer.valueOf(b);
						switch (number2) {
						case 1: {
							System.out.println("輸入(1)千分位");
							Format df = new DecimalFormat("#,##0.0###");
							String c = df.format(number);
							System.out.println("結果為:" + c);
							sc.close();
							break retreat;
						}
						case 2: {
							System.out.println("輸入(2)百分比");
							Format df = new DecimalFormat("####00.0##%");
							String c = df.format(number);
							System.out.println("結果為:" + c);
							sc.close();
							break retreat;
						}
						case 3: {
							System.out.println("輸入(3)科學記號");
							Format df = new DecimalFormat("#0.0E0#");
							String c = df.format(number);
							System.out.println("結果為:" + c);
							sc.close();
							break retreat;
						}
						}
					} else {
						System.out.println("輸入格式錯誤,請重新輸入");
						continue retreat2;
					}
				}

			} else {
				System.out.println("輸入格式錯誤,請重新輸入");
				continue retreat;
			}
		}
	}
}
