package lesson013;

public class Account {
	private String accountNo;
	private double money;
	private boolean krediBasvurusu;
	private double istenenKrediMiktar;
	
	
	public Account() {
		super();
	}
	public Account(String accountNo, double money) {
		super();
		this.accountNo = accountNo;
		this.money = money;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	public boolean isKrediBasvurusu() {
		return krediBasvurusu;
	}
	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}
	
	public double getIstenenKrediMiktar() {
		return istenenKrediMiktar;
	}
	public void setIstenenKrediMiktar(double istenenKrediMiktar) {
		this.istenenKrediMiktar = istenenKrediMiktar;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", money=" + money + "]";
	}
	
	
	
}
