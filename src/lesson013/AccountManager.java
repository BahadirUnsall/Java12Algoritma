package lesson013;

public class AccountManager {
	
	public void paraYatir(Account account, double yatirilanTutar) {
		if (yatirilanTutar <= 10000) {
			account.setMoney(account.getMoney()+yatirilanTutar);
			System.out.println(yatirilanTutar+ " kadar para eklediniz.");
			System.out.println("Guncel bakiye " + account.getMoney());
		}else {
			System.out.println("Maximum para yatirma tutarini astiniz.");
		}
		
	}
	public void paraCek(Account account, double cekilenTutar) {
		if (cekilenTutar <= account.getMoney() && cekilenTutar <= 5000) {
			account.setMoney(account.getMoney()-cekilenTutar);
			System.out.println(cekilenTutar + " kadar para cektiniz.");
			System.out.println("Guncel bakiye " + account.getMoney());
		}else {
			System.out.println("Maximum para cekme tutarini astiniz.");
		}
	}
	
	public void hesapBilgileri(Account account) {
		System.out.println(account);
	}
}
