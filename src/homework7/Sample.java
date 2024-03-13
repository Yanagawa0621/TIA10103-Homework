package homework7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
	public static void main(String[] args) {
		long sumb = 0;
		int sumc = 0;
		int suml = 0;
		String s;
		try {
			File fe = new File("src\\homework7\\Sample.txt");
			FileReader fr = new FileReader(fe);
			BufferedReader br = new BufferedReader(fr);
			sumb = fe.length();
			while ((s = br.readLine()) != null) {
				sumc += s.length();
				suml++;
			}
			System.out.println("Sample.txt檔案共有" + sumb + "個位元組，" + sumc + "個字元，" + suml + "列資料");
		br.close();
		fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
