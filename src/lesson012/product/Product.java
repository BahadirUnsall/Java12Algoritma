package lesson012.product;

import lesson012.product.utility.*;

public class Product {
	private String isim;
	private int id;
	private String seriNo;
	private int adet;

	public Product() {
		this.id = RandomGenerateId.generateId();
	}

	public Product(String isim, int id, String seriNo, int adet) {
		this();
		this.isim = isim;
		this.seriNo = seriNo;
		this.adet = adet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSeriNo() {
		return seriNo;
	}

	public void setSeriNo(String seriNo) {
		this.seriNo = seriNo;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}

	public void isimGuncelle(String isim) {
		setIsim(isim);
	}

	public void veritabaninaKaydet() {
		System.out.println(getIsim() + " veri tabanina kaydedildi.");
	}

	@Override
	public String toString() {
		return "Product [isim=" + isim + ", id=" + id + "]";
	}

}
