package lesson023;

import java.io.Serializable;

public class Ogrenci implements Serializable{
	private String isim;
	private double ort;
	public Ogrenci(String isim) {
		super();
		this.isim = isim;
	}
	
	public Ogrenci(String isim, double ort) {
		super();
		this.isim = isim;
		this.ort = ort;
	}

	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getNot() {
		return ort;
	}
	public void setNot(double not) {
		this.ort = not;
	}
	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", not=" + ort + "]";
	}
	
	
}
