package models;

public class Product {
	String name;
	double price;
	public Product() {	
	}
	

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public Product(String name, double price) {
	
		this.name = name;
		this.price = price;
	}

}
