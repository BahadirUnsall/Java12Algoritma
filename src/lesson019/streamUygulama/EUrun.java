package lesson019.streamUygulama;

public enum EUrun {
	Cips(50),Kola(25),Gofret(15),Sut(20),Kek(12);
	
	private double urunFiyat;

	
	
	private EUrun(double urunFiyat) {
		this.urunFiyat = urunFiyat;
	}



	public double getUrunFiyat() {
		return urunFiyat;
	}
	
	
}
