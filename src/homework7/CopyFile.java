package homework7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
	public static void copyFile() {
		int i;
		File dinner1 = new File("src\\homework7\\dinner1.txt");
		File dinner2 = new File("src\\homework7\\dinner2.txt");

		try {
			FileReader fr = new FileReader(dinner1);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(dinner2, true);
			BufferedWriter bw = new BufferedWriter(fw);

			while ((i = br.read()) != -1) {
				bw.write((char) i);
			}
			bw.write("\n");

			bw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		copyFile();
	}
}
