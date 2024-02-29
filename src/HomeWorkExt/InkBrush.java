package HomeWorkExt;

public class InkBrush extends Pen{
	private double dscount=1;
	public InkBrush(String brand,double price,double dscount) {
		super(brand,price);
		this.dscount=dscount;
	}
	public InkBrush() {
	}
	double getPrice() {
		return super.getPrice()*dscount;
	}
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}

