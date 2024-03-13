package homework7;

import java.io.FileWriter;

public class Data {
	public static void main(String[] args) {
		try {
			FileWriter fos = new FileWriter("src\\homework7\\Data.txt", true);
			for (int i = 0; i < 10; i++) {
				int e = (int) (Math.random() * 1000) + 10;
				String s=""+e+"\t";
				fos.write(s);
			}
			fos.write("\n");
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
