package homework7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;

public class AnimalMain implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args)  {
		Object[] a = new Object[4];
		a[0] = new Dog("Nana");
		a[1] = new Dog("Natu");
		a[2] = new Cat("Miru");
		a[3] = new Cat("Kurimu");
		ObjectInputStream ois = null;

		try {
			File fn = new File("C:\\data");
			fn.mkdir();
			File fi = new File("C:\\data\\Object.ser");
			fi.createNewFile();
			FileOutputStream fos = new FileOutputStream(fi);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (int i = 0; i < a.length; i++) {
				oos.writeObject(a[i]);
			}
			oos.close();
			fos.close();

			FileInputStream fis = new FileInputStream(fi);
			ois = new ObjectInputStream(fis);
			while (true) {
				Object ot = ois.readObject();
				if (ot instanceof Dog) {
					((Dog) ot).speak();
				} else if (ot instanceof Cat) {
					((Cat) ot).speak();
				}
			}
		} catch (java.io.EOFException e) {
			System.out.println("讀取完畢");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
