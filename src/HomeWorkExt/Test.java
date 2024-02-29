package HomeWorkExt;

public class Test {
	public static void main(String[] args) {
		Pen e[]=new Pen[3];
		
		e[0]=new Pencil("雄獅",1000,0.8);
		e[0].write();
		System.out.println(e[0].getPrice());
		System.out.println("==============");
		
		e[1]=new InkBrush("Columbus",2000,0.9);
		e[1].write();
		System.out.println(e[1].getPrice());
		System.out.println("==============");
		
		e[2]=new Pencil();
		e[2].setBrand("SKB");
		e[2].setPrice(500);
		e[2].write();
		System.out.println(e[2].getPrice());
		System.out.println("==============");
		
	}
}
