package hw1;

import java.util.Scanner;

public class Homework5_5 {
	public static String getAuthCode() {
		String verify = "";
		for (int i = 0; i < 8; i++) {
			fall: for (;;) {
				int a = (int) (Math.random() * 122) + 1;

				// 保留1~9的數字,將65~90轉換成A~Z,97~122轉換成a~z
				if (a < 10 || (a > 64 && a < 91) || (a > 96 && a < 123)) {
					if (a < 10) { // 將數字(除了1~9之外)轉成字元,並串接成字串
						verify = verify + a;
						break; // 拿到符合規則的東西後跳出無限迴圈
					} else {
						verify = verify + (char) a;
						break; // 拿到符合規則的東西後跳出無限迴圈
					}
				} else {
					continue fall; // 沒拿到要求的數字就退回重拿
				}
			}
		}
		return verify;
	}

	public static void main(String[] args) {
		again: for (;;) {
			String get = getAuthCode();
			System.out.println("本次隨機產生驗證碼為:");
			System.out.println(get);
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入驗證碼");
			String reply = sc.nextLine();
			if (reply.equals(get)) {
				System.out.println("輸入正確");
				break;
			} else {
				System.out.println("輸入錯誤");
				System.out.println("=====重新生成驗證碼=====");
				continue again;
			}
		}
	}
}
