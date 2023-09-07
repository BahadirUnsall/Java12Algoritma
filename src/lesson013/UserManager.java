package lesson013;

import java.util.Scanner;

public class UserManager {
	
	static Scanner scanner = new Scanner(System.in);
	private User user;
	
	public static String generateEmail(String name, String surname) {
		return name + "." + surname + "@xbanka.com";
	}
	
	public void krediBasvuruYap(Account account, double krediMiktar) {
		account.setKrediBasvurusu(true);
		account.setIstenenKrediMiktar(krediMiktar);
		
		System.out.println(krediMiktar + " Degerinde kredi basvurusunda bulundunuz lutfen onay bekleyiniz.");
		
	}
}
