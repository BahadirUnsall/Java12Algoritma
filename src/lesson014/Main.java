package lesson014;

import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static Library library = new Library("Milli kütüphane");
	
	public static void main(String[] args) {
		
		Main.library.getBookList().add(new Book("XKitabı","Ali", "AYayın", 150, new Category("Polisiye")));
		Main.library.getBookList().add(new Book("YKitabı","Ali", "BYayın", 200, new Category("Roman")));
		Main.library.getBookList().add(new Book("ZKitabı","Ayşe", "CYayın", 300, new Category("Öykü")));
		Main.library.getBookList().add(new Book("DKitabı","Mehmet", "DYayın", 350, new Category("Hikaye")));
		
		systemMenu();
		
	}
	public static void systemMenu() {
		
		LibraryServiceImpl serviceImpl = new LibraryServiceImpl();
		
		while(true) {
			showMenu();
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
			case 0:
				System.out.println("Sistemden çıktınız.");
				System.exit(0);
			default:
				break;
			}
		}
	}
	static void showMenu() {
		System.out.println("1-Sisteme kitap ekle");
		System.out.println("2-Kitaplari listele");
		System.out.println("3-Aktif olan kitaplari listele");
		System.out.println("4-Yazarin ismine göre listele");
		System.out.println("5-Id'ye gore sil");
		System.out.println("0-Cikis");
		System.out.println();
		System.out.println();
	}

}
