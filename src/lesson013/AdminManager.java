package lesson013;

public class AdminManager {
	public void basvuruOnayla(User user) {
		if(user.getAccount().isKrediBasvurusu()) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Kredi başvurunuz onaylanmıştır. ");
			mailGonder(user,"Kredi başvurunuz onaylanmıştır");
			user.getAccount().setMoney(user.getAccount().getMoney() + user.getAccount().getIstenenKrediMiktari());
			user.getAccount().setIstenenKrediMiktari(0);
			user.getAccount().setKrediBasvurusu(false);
		}else {
			System.out.println(user.getAccount().getAccountNo() + " Numaralı Hesap için Kredi başvurusu bulunmamaktadır");
		}
	}
	public void basvuruReddet(User user) {
		if (user.getAccount().isKrediBasvurusu()) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Kredi basvurunuz reddedilmistir.");
			mailGonder(user, user.getAccount().getIstenenKrediMiktari()+ " Tl'lik kredi basvurunuz reddedilmiştir.");
			
			user.getAccount().setIstenenKrediMiktari(0);
			user.getAccount().setKrediBasvurusu(false);
		}else {
			System.out.println(user.getAccount().getAccountNo() + " numaralı hesap için kredi başvırısı bulunmamaktadır.");
		}
	}
	public void mailGonder(User user,String mesaj) {
		Mail mail = new Mail();
		mail.setBaslik("KrediBasvuruHakkında");
		mail.setIcerik(mesaj);
		
		
		user.getArraylistListMail().add(mail);
	}
}	
