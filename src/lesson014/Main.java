package lesson014;

import java.util.List;
import java.util.Scanner;

import lesson013.AdminManager;

public class Main {
	static Library library = new Library("Milli kütüphane");
	static CustomerManager customerManager = new CustomerManager();
	static LibraryServiceImpl serviceImpl = new LibraryServiceImpl();
	
	public static void main(String[] args) {
		
		Main.library.getBookList().add(new Book("XKitabı","Ali", "AYayın", 150, new Category("Polisiye")));
		Main.library.getBookList().add(new Book("YKitabı","Ali", "BYayın", 200, new Category("Roman")));
		Main.library.getBookList().add(new Book("ZKitabı","Ayşe", "CYayın", 300, new Category("Öykü")));
		Main.library.getBookList().add(new Book("DKitabı","Mehmet", "DYayın", 350, new Category("Hikaye")));
		
		librarySystemMenu();
		
	}
	public static void systemAdminMenu() {

		String id = "";
		
		while(true) {
			showAdminMenu();   
			int secim = Util.getIntValue("Seçiminizi girin");
			switch (secim) {
			case 1:
				serviceImpl.createBook();
				break;
			case 2:
				serviceImpl.getAllBooks(library.getBookList());
				break;
			case 3:
				serviceImpl.getAllBooksByActive();
				break;
			case 4:
				serviceImpl.getAuthorByName();
				break;
			case 5:
				serviceImpl.deleteBookByID();
				break;
			case 6:
				serviceImpl.getAllBooks(library.getBookList());
				id = Util.getStringValue("Silmek istedigin kitabin id sini gonder.");
				serviceImpl.changeStatusToDeleted(id);
				break;
			case 7:
				serviceImpl.getAllBooks(library.getBookList());
				id = Util.getStringValue("indirim istedigin kitabin id sini gonder.");
				double discountPrice = Util.getDoubleValue("İndirim girin");
				serviceImpl.applyDiscount(id, discountPrice);
				break;
			case 0:
				librarySystemMenu();
				break;
			default:
				break;
			}
		}
	}
	
	public static void librarySystemMenu() {
		System.out.println("1-Admin Girisi");
		System.out.println("2-User islemleri");
		System.out.println("0-Sistemi kapat");
		int vote = Util.getIntValue("seçiniz.");
		
		while(true) {
			switch (vote) {
			case 1:
				systemAdminMenu();
				break;
			case 2:	
				userPage();
				break;
			case 0:
				System.out.println("Sistem kapandi");
				System.exit(0);
				break;
			default:
				break;
			}
		}
		
	}

	public static void userPage() {
		
		
		
		while(true) {
			System.out.println("1-Register");
			System.out.println("2-Login");
			System.out.println("0-Sistemi kapat");
			int vote = Util.getIntValue("seçiniz.");
			switch (vote) {
			case 1:
				customerManager.register();
				break;
			case 2:	
				Customer customer = customerManager.login();
				if (customer!=null) {
					systemCustomerMenu(customer);
				}
				break;
			case 0:
				System.out.println("Sistem kapandi");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

	
	
	static void systemCustomerMenu(Customer customer) {
		while(true) {
			showCustomerMenu();
			int vote = Util.getIntValue("seçiniz.");
			switch (vote) {
			case 1:
				customerManager.rentBook(customer);
				break;
			case 2:	
				customerManager.kiralananKitaplariGoster(customer);
				break;
			case 3: 
				customerManager.returnBook(customer);
				break;
			case 0:
				System.out.println("Sistem kapandi");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	static void showAdminMenu() {
		System.out.println("1-Sisteme kitap ekle");
		System.out.println("2-Kitaplari listele");
		System.out.println("3-Aktif olan kitaplari listele");
		System.out.println("4-Yazarin ismine göre listele");
		System.out.println("5-Id'ye gore sil");
		System.out.println("6-Id'ye gore DELETED konumuna cevir");
		System.out.println("7-Indirim uygula");
		System.out.println("0-Cikis");
		System.out.println();
		
	}
	static void showCustomerMenu() {
		System.out.println("1-Kitap kirala");
		System.out.println("2-kiralanan kitaplari göster");
		System.out.println("3-kitabi iade et");
		System.out.println("0-Logout");
		System.out.println();
		
	}

}
