package lesson012.product;

import lesson012.product.utility.*;

public class Product {

	private String name;

	private String id;

	private int stock;

	private double price;

	private String productCode;

	private boolean isActive = true;;

	// this --> eğer isimlendirmeler aynı ise
	// public void (String name){
	// this.name = name
	// }

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	// Overloading
	public Product() {
		this.id = RandomGenerateID.generateId();
	}

	public Product(String name, int stock, double price) {
		this();
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.productCode = RandomGenerateID.generadeProductCode(name);
	}

	public String getPdocutCode() {
		return productCode;
	}

	public void setPdocutCode(String productCode) {
		this.productCode = productCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if (stock <= 0) {
			System.out.println("Stok 0 dan az olamaz");
		} else {
			this.stock = stock;
			addToListing();
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			System.out.println("Stok 0 dan az olamaz");
		} else {
			this.price = price;
		}
	}

	public void updateName(String name) {
		setName(name);
	}

	public void saveToDatabase() {
		System.out.println(getName() + " Veritabanına Kaydedildi");
	}

	public void removeFromList() {
		setActive(false);
		System.out.println("Gosterimden kaldirildi.");
	}

	public void addToListing() {
		setActive(true);
		System.out.println("Gosterime koyuldu.");
	}

}
