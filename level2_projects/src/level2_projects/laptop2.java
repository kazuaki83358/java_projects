package level2_projects;

public class laptop2  {
	private String brand;
	private int price;
	private int ram;
	public laptop2(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	@Override
	public String toString() {
		return "laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
