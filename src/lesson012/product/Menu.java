package lesson012.product;

import java.util.Scanner;

public class Menu {

	static Scanner scanner = new Scanner(System.in);
	static Cart cart = new Cart();

	public static void menu() {

		int election;

		do {
			showScreen();
			System.out.print("Seçiminizi girin: ");
			election = scanner.nextInt();
			scanner.nextLine();

			switch (election) {
			case 1:
				addProduct();
				break;
			case 2:
				listAllProductByActive();
				break;
			case 3:
				addToCart();
				break;
			case 4:
				findByProductCodeFromDatabase();
				break;
			case 5:
				hideFromList();
				break;
			case 0:
				System.out.println("Program kapandı");
				break;

			default:
				break;
			}

		} while (election != 0);

	}

	public static void showScreen() {
		System.out.println("1- Ürün ekle");
		System.out.println("2- Ürünleri listele");
		System.out.println("3- Sepete ekle");
		System.out.println("4- Ürün Koduna Göre Arama Yap");
		System.out.println("0- Çıkış");
	}

	public static Product addProduct() {
		System.out.println("Ürün adı: ");
		String urunAdi = scanner.nextLine();

		System.out.println("Ürün stoku: ");
		int stock = scanner.nextInt();

		System.out.println("Ürün fiyatı: ");
		double price = scanner.nextDouble();

		Product product = new Product(urunAdi, stock, price);

		System.out.println("Ürün başarıyla eklendi ");
		Database.getDatabase().add(product);
		scanner.nextLine();

		return product;
	}

	public static void listAllProductByActive() {
		String list = "No\tID\t\tName\t\tStock\t\tPrice\n";
		int index = 1;
		for (int i = 0; i < Database.getDatabase().size(); i++) {
			if (Database.getDatabase().get(i).isActive()) {

				list += index + ".\t" + Database.getDatabase().get(i).getId() 
						+ "\t\t"+ Database.getDatabase().get(i).getName() 
						+ "\t\t" + Database.getDatabase().get(i).getStock()
						+ "\t\t" + Database.getDatabase().get(i).getPrice()
						+ "\t\t" + Database.getDatabase().get(i).getPdocutCode()+ "\n";
				index++;
			}
		}
		System.out.print(list);
	}
	
	public static void addToCart() {
		listAllProductByActive();
		System.out.println("Sepete eklemek istediğiniz Ünü ID'si: ");
		String productId = scanner.nextLine();
		
		for (Product product : Database.getDatabase()) {
			if(product.getId().equals(productId)) {
				cart.addToCart(product);
				return;
			}
		}
		System.out.println("urun bulunamadi");
	}
	
	public static void findByProductCodeFromDatabase() {
		System.out.println("Hangi ürünü aramak istiyosunuz");
		String productCode = scanner.nextLine();
		for (Product product : Database.getDatabase()) {
			if(product.getPdocutCode().equalsIgnoreCase(productCode)) {
				System.out.println("Silinen urun: " + product.toString());
				return;
			}
		}
		System.out.println("urun bulunamadi");
	}
	public static void hideFromList() {
		System.out.println("Hangi ürünü kaldirmak istiyorsunuz");
		String name = scanner.nextLine();
		for (Product product : Database.getDatabase()) {
			if(product.getName().equalsIgnoreCase(name)) {
				product.setActive(false);
				System.out.println(Database.getDatabase());
				return;
			}
		}
		System.out.println("urun bulunamadi");
	}
}
	

