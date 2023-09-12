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
		account.setIstenenKrediMiktari(krediMiktar);

		System.out.println(krediMiktar + " Degerinde kredi basvurusunda bulundunuz lutfen onay bekleyiniz.");
		System.out.println();

	}

	public void krediBorcuOde(Account account, double miktar, boolean isCash) {

//		if (account.getMoney() >= miktar) {
//			account.setMoney(account.getMoney() - miktar);
//			System.out.println(
//					"Ödediğiniz miktar: " + miktar + " tldir, " + account.getMoney() + " kadar borcunuz kaldı.");
//		}
		if (isCash) {
			if (account.getKrediBorcu() > 0 && miktar <= account.getKrediBorcu()) {
				account.setKrediBorcu(account.getKrediBorcu() - miktar);
				account.setKrediPuani(account.getKrediPuani() + Account.KREDI_PUAN_ARTIS_MIKTARI);
				System.out.println(miktar + " Tl kadar kredi borcunuzu ödediniz güncel kredi borcunuz --> "
						+ account.getKrediBorcu());
			} else {
				System.out.println((account.getKrediBorcu() > 0) ? "kredi borcundan fazla ödeme yapamazsınız."
						: " Kredi borcunuz yok.");
			}
		} else {
			if (account.getMoney() >= miktar && miktar <= account.getKrediBorcu()) {
				account.setMoney(account.getMoney() - miktar);
				account.setKrediPuani(account.getKrediPuani() + Account.KREDI_PUAN_ARTIS_MIKTARI);
				System.out.println(miktar + " Tl kadar kredi borcunuzu ödediniz güncel kredi borcunuz --> "
						+ account.getKrediBorcu());
			} else {
				System.out.println(
						(account.getKrediBorcu() > 0)
								? (account.getMoney() < miktar) ? "kredi borcundan fazla ödeme yapamazsınız."
										: " Hesap bakiye yetersiz"
								: " Kredi borcunuz yok.");
			}
		}

	}
}
