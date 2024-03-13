package homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPractise {
	public static void main(String[] args) {
		Collection e = new ArrayList();
		e.add(new Integer(100));
		e.add(new Double(3.14));
		e.add(new Long(21L));
		e.add(new Short("100"));
		e.add(new Double(5.1));
		e.add("Kitty");
		e.add(new Integer(100));
		e.add(new Object());
		e.add("Snoopy");
		e.add(new BigInteger("1000"));

//========================================================================
		// Iterator
		Iterator it = e.iterator();

		while (it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
		System.out.println("====================");
//========================================================================
		// 傳統for
		for (int i = 0; i < e.size(); i++) {
			System.out.println(((ArrayList) e).get(i));
		}
		System.out.println("====================");
//========================================================================
		// for-each
		for (Object element1 : e) {
			System.out.println(element1);
		}
		System.out.println("====================");
//========================================================================
		// 移除不是java.lang.Number相關的物件
		ArrayList<Number> f = new ArrayList<Number>();

		// 篩選出Number物件並裝進f裡
		for (Object element1 : e) {
			if (element1 instanceof Number) {
				f.add((Number) element1);
			}
		}

		// 印出f
		for (Number element2 : f) {
			System.out.println(element2);
		}

	}
}
