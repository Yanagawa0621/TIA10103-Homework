package homework10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateConversion {
	public static void main(String[] args) {
		String regex = "^\\d{8}$";
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		sdf.setLenient(false); // 禁用SimpleDateFormat對日一的寬容性(用來檢測日期是否符合現實日期規則)
		retreat: for (;;) {
			System.out.println("請輸入日期(年月日,如:20110131)");
			String enter = sc.nextLine();

			// 確認輸入進來的資料是否符合要求的格式
			if (enter.matches(regex)) {
				try {
					Date date = sdf.parse(enter); // 將輸入的資料轉成日期格式
					retreat2: for (;;) {
						System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年");
						int b = sc.nextInt();

						// 確認選項輸入是否正確
						if (b == 1 || b == 2 || b == 3) {

							// 轉換日期格式
							switch (b) {
							case 1: {
								SimpleDateFormat i = new SimpleDateFormat("yyyy/MM/dd");
								System.out.println(i.format(date));
								sc.close();
								break retreat; // 跳全部無限迴圈
							}
							case 2: {
								SimpleDateFormat i = new SimpleDateFormat("MM/dd/yyyy");
								System.out.println(i.format(date));
								sc.close();
								break retreat; // 跳全部無限迴圈
							}
							case 3: {
								SimpleDateFormat i = new SimpleDateFormat("dd/MM/yyyy");
								System.out.println(i.format(date));
								sc.close();
								break retreat; // 跳全部無限迴圈
							}
							}
						} else {
							System.out.println("輸入無效選項,請從新輸入");
							continue retreat2; // 回到第二層無限迴圈從新輸入
						}
					}
				} catch (ParseException e) {
					System.out.println("輸入日期無效,請從新輸入");
					continue retreat; // 回到第一層無限迴圈從新輸入
				}
			} else {
				System.out.println("日期格式輸入錯誤");
				continue retreat; // 回到第一層無限迴圈從新輸入
			}
		}

	}
}
