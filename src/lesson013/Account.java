package lesson013;

public class Account {
	public static final int KREDI_PUAN_ARTIS_MIKTARI = 10;
	private String accountNo;
	private double money;
	private boolean krediBasvurusu;
	private double istenenKrediMiktari;
	private double krediBorcu;
	private int krediPuani;
	
	public Account() {
		super();
	}
	public Account(String accountNo, double money) {
		super();
		this.accountNo = accountNo;
		this.money = money;
	}
	
	
	
	public double getKrediBorcu() {
		return krediBorcu;
	}
	public void setKrediBorcu(double krediBorcu) {
		this.krediBorcu = krediBorcu;
	}
	public int getKrediPuani() {
		return krediPuani;
	}
	public void setKrediPuani(int krediPuani) {
		this.krediPuani = krediPuani;
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
	
	public double getIstenenKrediMiktari() {
		return istenenKrediMiktari;
	}
	public void setIstenenKrediMiktari(double istenenKrediMiktar) {
		this.istenenKrediMiktari = istenenKrediMiktar;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", money=" + money + "]";
	}
	
	
	
}
