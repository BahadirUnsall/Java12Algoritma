package lesson012.product;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static Database database = new Database();

	public static void main(String[] args) {

		// Product sınıfı oluşturalım
		// gerekli fieldları yazalım

		// değişkenler private

		// isimGuncelle()
		// veritabanınaKaydet() --> ismini yazdıralım veritabanıın kaydedildi yazsın

		// Bir product nesnesi oluşturdugumda id si Otomatik olarak belirlensin
		// 1000 - 10000
		// 2753
		// Farklı bir paketin içinde yapalım
		// Class ismi RandomGenerateID

//		Product product = new Product();
//		product.setName("Asus");
//		product.setPrice(15000);
//		product.setStock(100);
//		System.out.println(product.getId()); 
//		
//		Product product2 = new Product("HpLaptop",150,1900);
//		System.out.println(product2.getId()); 
//		
//		
//		System.out.println(product.getName());
//		product.updateName("AsusX");
//		System.out.println(product.getName());
//		product.saveToDatabase();
//		System.out.println("--------------------------");
//		
//		System.out.println(product2.getId());
//		System.out.println(product2.getPdocutCode());

//		Product product5 = new Product("Apple", 2, 200);
//		Product product6 = new Product("Samsung", 10, 200);
//		Product product7 = new Product("Huawei", 10, 200);
//
//		Cart cart1 = new Cart();
//
//		cart1.addToCart(product6);
//		cart1.addToCart(product7);
//
//		System.out.println(cart1.getAmount());
//		System.out.println(cart1.getTotalPrice());
//		
//		System.out.println("----------------------------------------");
//		
//		System.out.println(product5.isActive());
//		
//		
//		cart1.addToCart(product5);
//		cart1.addToCart(product5);
//		cart1.addToCart(product5);
//		
//		product5.removeFromList();
//		
//		System.out.println(product5.isActive());
//		
//		System.out.println("---------------------------");
//		
//		cart1.cartList();
//		System.out.println("---------------------------");
//		Cart cart2 = new Cart();
//		Product yeniEklenenProduct = addProduct();
//		cart2.addToCart(yeniEklenenProduct);
//		cart2.cartList();
		
		addProduct();
		addProduct();
		addProduct();
		
		for (Product product : Database.getDatabase()) {
			System.out.println(product.getName());
		}
		
		
		
		
	
	}
	public static Product addProduct() {
		Product product = new Product();
		System.out.println("Urun adi girin");
		product.setName(scanner.nextLine());
		System.out.println("Stok sayisini girin");
		product.setStock(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Urun fiyat girin");
		product.setPrice(scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Urun eklendi");
		
		
		Database.getDatabase().add(product);
		return product;
		
	}

}
