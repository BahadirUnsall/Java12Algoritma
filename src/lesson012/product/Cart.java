package lesson012.product;

import java.util.ArrayList;
import lesson012.product.Product.*;

public class Cart {
	private double totalPrice;
	private int amount;
	private ArrayList<Product> products;

	public Cart() {
		this.products = new ArrayList<Product>();
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void addToCart(Product product) {
		if (product.getStock() <= 0) {
			System.out.println("Product stokta yok");
		} else {
			getProducts().add(product);
			product.setStock(product.getStock() - 1);
			setAmount(getAmount() + 1);
			setTotalPrice(getTotalPrice() + product.getPrice());
		}
	}
	public void cartList() {
		for (Product product : products) {
			System.out.println("name= " + product.getName() +"   fiyati= " + product.getPrice());
		}
	}
	
}
