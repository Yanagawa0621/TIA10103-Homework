package HomeWorkExt;

public class Pencil extends Pen {
	private double dscount=1;
	public Pencil(String brand,double price,double dscount) {
		super(brand,price);
		this.dscount=dscount;
	}
	public Pencil() {
	}
	double getPrice() {
		return super.getPrice()*dscount;
	}
	public void write() {
		System.out.println("削鉛筆再寫");
	}
}
