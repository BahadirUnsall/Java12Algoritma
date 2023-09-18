package lesson016;

public class Musteri {

	private String isim;
	private int yas;
	public Musteri(String isim, int yas) {
		this.isim = isim;
		this.yas = yas;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	@Override
	public String toString() {
		return "Musteri [isim=" + isim + ", yas=" + yas + "]";
	}
	
	
	
	

}
