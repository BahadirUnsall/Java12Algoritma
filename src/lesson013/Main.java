package lesson013;

public class Main {

	public static void main(String[] args) {
		
		AccountManager accountManager = new AccountManager();
		Account account1 = new Account("15151515", 1000);
		
		System.out.println("guncel bakiye " + account1.getMoney());
		System.out.println("------------------------");
		
		accountManager.paraYatir(account1, 2500);
		System.out.println("------------------------");
		accountManager.paraCek(account1, 2000);
		
		System.out.println("------------------------");
		
		accountManager.hesapBilgileri(account1);
		System.out.println("------------------------");
		System.out.println("------------------------");
		
		
		User user1 = new User("bahadir", "unsal", account1);
		
		UserManager userManager = new UserManager();
		
		System.out.println(user1.getEmail());
		
		
		System.out.println("*****************************");
		
		userManager.krediBasvuruYap(account1, 15000);
		System.out.println(account1.getIstenenKrediMiktar());
		System.out.println(account1.isKrediBasvurusu());
		AdminManager adminManager = new AdminManager();
		
		adminManager.basvuruOnayla(account1);
		System.out.println(account1.getMoney());
		System.out.println("-----------------------");
		adminManager.basvuruReddet(account1);
		System.out.println(account1.getMoney());

	}

}
