package lesson014;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomerManager {
	static DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	public void register() {
		String username = Util.getStringValue("Kullanici adi girin");
		String password = Util.getStringValue("Sifrenizi girin");
		String tc = Util.getStringValue("Tc nizi girin");
		double balance = Util.getDoubleValue("Bakiyenizi girin");

		Customer customer = new Customer(username, password, tc, balance);

		Main.library.getCustomerList().add(customer);
		System.out.println("Kayit basarili Sisteme hosgeldiniz " + username);
	}
	public Customer login() {
		String username = Util.getStringValue("Kullanici adi girin");
		Customer customer = findByUsername(username);
		if (customer!=null) {
			for (int i = 3; i >= 0; i--) {
				String password = Util.getStringValue("Sifrenizi girin");
				if (customer.getPassword().equals(password)) {
					System.out.println("Giris basarili");
					return customer;
				}else {
					System.out.println("Sifre yanlis " + (i-1) + "hakkiniz kaldi.");
					
				}
			}
			System.out.println("Hesabiniz askiya alindi.");
			return null;
		}else {
			System.out.println("Kullanici bulunamadi");
			return null;
		}
	}
	private Customer findByUsername(String username) {
		for (Customer customer : Main.library.getCustomerList()) {
			if (customer.getUsername().equals(username)) {
				return customer;
			}
		}
		return null;
		
	}
	public void rentBook(Customer customer) {
		Main.serviceImpl.getAllBooks(Main.library.getBookList());
		String id = Util.getStringValue("Kiralamak istediğiniz id yi girin");
		Book book = Main.serviceImpl.findById(id);
		if(book == null) {
			System.out.println("Kitap bulunamadı");
			return;
		}
		if(book.geteStatus().name().equals("ACTIVE")) {
			if(customer.getBalance() >= book.getPrice()) {
				customer.getRentedBooks().add(book);
				customer.setBalance(customer.getBalance() - book.getPrice());
				
				
				book.setRentDate(LocalDateTime.now());
				book.setReturnedDate(iadeTarihiBelirle());
				
				book.seteStatus(EStatus.INRENT);
				
				System.out.println("Kitabı iade etmeniz gereken Tarih "+ book.getReturnedDate().format(format));
				System.out.println(book.getBookName() + " Kitap Kiralama işlemi Başarılı");
			}else 
				System.out.println("Bakiyeniz yetersizdir");
		}else
			System.out.println("Kitap Kiralanmak için Aktif değildir");
	}
	public LocalDateTime iadeTarihiBelirle() {
		int iadeTarihi = Util.getIntValue("Kaç gün Sonra iade Edeceksiniz?");
		LocalDateTime currentDate = LocalDateTime.now();
		LocalDateTime returnedDate = currentDate.plusDays(iadeTarihi);
		return returnedDate;
	}	
	public void kiralananKitaplariGoster(Customer customer) {
		if(customer.getRentedBooks().isEmpty()) {
			System.out.println("Kiralanan Kitap Yoktur");
		}else {
			customer.getRentedBooks()
			.forEach(book -> System.out.println(book.getBookName() + " İade Tarihi: "+ book.getReturnedDate().format(format)));
		}
	}
	public void returnBook(Customer customer) {
		kiralananKitaplariGoster(customer);
		String bookId = Util.getStringValue("Hangi kitabı iade etmek istiyosunuz?");
		Book book = Main.serviceImpl.findById(bookId);
		if(book == null) {
			System.out.println("Kütüphanede böyle bir kitap yok");
			return;
		}
		if(customer.getRentedBooks().remove(book)){
			System.out.println("Kitap iade işlemi başarılıdır.");
			book.seteStatus(EStatus.ACTIVE);
		}else {
			System.out.println("Kiraldıgınız kitaplar arasında böyle bir kitap yok");
		}
	}
}
