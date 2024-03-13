package homework8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TrainMain {
	public static void main(String[] args) {
		Train e1=new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train e2=new Train(1254, "區間", "屏東", "基隆", 700);
		Train e3=new Train(118, "自強", "高雄", "台北", 500);
		Train e4=new Train(1288, "區間", "新竹", "基隆", 400);
		Train e5=new Train(122, "自強", "台中", "花蓮", 600);
		Train e6=new Train(1222, "區間", "樹林", "七堵", 300);
		Train e7=new Train(1254, "區間", "屏東", "基隆", 700);
		
//===============================================================
		//不重複的Train物件
		HashSet<Train> a=new HashSet<>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		a.add(e5);
		a.add(e5);
		a.add(e6);
		a.add(e7);
		
		for(Train element:a) {
			System.out.println(element);
		}
		System.out.println("=========================================");
//===============================================================
		//Train物件印出時，能以班次編號由大到小印出
		ArrayList<Train> b=new ArrayList<>();
		b.add(e1);
		b.add(e2);
		b.add(e3);
		b.add(e4);
		b.add(e5);
		b.add(e6);
		b.add(e7);
		Collections.sort(b);
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i));
		}
		System.out.println("=========================================");
//===============================================================
		//班次編號由大排到小印出， 還可以不重複印出Train物件
		TreeSet<Train> c=new TreeSet<>();
		c.add(e1);
		c.add(e2);
		c.add(e3);
		c.add(e4);
		c.add(e5);
		c.add(e6);
		c.add(e7);
		Iterator<Train> train=c.iterator();
		while (train.hasNext()) {
			System.out.println(train.next());
		}
	}
}
