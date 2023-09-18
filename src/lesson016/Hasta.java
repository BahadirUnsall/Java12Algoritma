package lesson016;

public class Hasta implements Comparable<Hasta>{
	private String isim;
	private ESikayet sikayet;
	public Hasta(String isim, ESikayet sikayet) {
		super();
		this.isim = isim;
		this.sikayet = sikayet;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public ESikayet getSikayet() {
		return sikayet;
	}
	public void setSikayet(ESikayet sikayet) {
		this.sikayet = sikayet;
	}
	@Override
	public int compareTo(Hasta o) {
		return this.sikayet.ordinal() - o.getSikayet().ordinal();
	}
	@Override
	public String toString() {
		return "Hasta [isim=" + isim + ", sikayet=" + sikayet + "]";
	}
	
	
	
}
