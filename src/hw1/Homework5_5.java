package hw1;

public class Homework5_5 {
	public static String getAuthCode() {
		int[] number = new int[8];
		String verify = "";

		// 生成能轉成字母及1~9的整數
		for (int i = 0; i < number.length; i++) {
			fall: for (;;) {
				int a = (int) (Math.random() * 122) + 1;
				if (a < 10 || (a > 64 && a < 91) || (a > 96 && a < 123)) {
					number[i] = a;
					break;
				} else {
					continue fall; //沒拿到要求的數字就退回重拿
				}
			}
		}

		// 將生成的數字轉成字母(除1~9),並相接成字串
		for (int i = 0; i < number.length; i++) {
			if (number[i] < 10) {
				verify = verify + number[i];
			} else {
				char change = (char) number[i];
				verify = verify + change;
			}
		}
		return verify;
	}

	public static void main(String[] args) {
		System.out.println(getAuthCode());
	}
}
