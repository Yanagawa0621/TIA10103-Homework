package HomeWorkExt;

public abstract class Pen {
	private String brand;
	private double price;
	public Pen() {
	}
	public Pen(String brand,double price) {
		setBrand(brand);
		setPrice(price);
		
	}
	void setBrand(String brand) {
		this.brand=brand;
	}
	void setPrice(double price) {
		this.price=price;
	}
	String getBrand() {
		return brand;
	}
	double getPrice() {
		return price;
	}
	public abstract void write();
}
