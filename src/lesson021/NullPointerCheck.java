package lesson021;

public class NullPointerCheck extends RuntimeException{
	private String mesaj;
	
	public NullPointerCheck(String mesaj){
		super(mesaj);
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	
	
	
}
