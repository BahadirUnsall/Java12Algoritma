package lesson013;

public class User {
	private String ad;
	private String soyad;
	private String email;
	private Account account;
	
	public User() {
		
	}

	public User(String ad, String soyad, Account account) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.email = UserManager.generateEmail(ad, soyad);
		this.account = account;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	

	
	
}
