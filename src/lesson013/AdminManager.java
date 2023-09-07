package lesson013;

public class AdminManager {
	public void basvuruOnayla(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi basvurunuz onaylanmistir.");
			
			account.setMoney(account.getMoney() + account.getIstenenKrediMiktar());
			account.setIstenenKrediMiktar(0);
			account.setKrediBasvurusu(false);
		}else {
			System.out.println(account.getAccountNo() + " Numarali hesap icin basvuru onaylanmadi");
		}
	}
	public void basvuruReddet(Account account) {
		if (account.isKrediBasvurusu()) {
			System.out.println("Kredi basvurunuz reddedilmistir.");
			account.setKrediBasvurusu(false);
		}
	}
}	
