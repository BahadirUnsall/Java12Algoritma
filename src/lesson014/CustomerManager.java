package lesson014;

public class CustomerManager {
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
	
	
	
}
