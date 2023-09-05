package lesson012.bahadir;

public class Profile {
	// attribute, property, field
	public String profilResmi;
	public String kullaniciAdi;
	public String isim;
	public int takipciSayisi;
	public int takipSayisi;
	public String[] posts;
	public int postSayisi;
	public boolean maviTik;

	public Profile() {
		posts = new String[10];
	}

	public void postOlustur(String isim) {
		System.out.println(isim + " adli post olusturuldu.");
		posts[postSayisi] = isim;
		postSayisi++;
	}

	public void profilIsimGuncelle(String isim) {
		this.isim = isim;
	}

	public void istegiKabulEt() {
		System.out.println("Kabul edildi");
		this.takipciSayisi++;
		maviTikKontrol();
	}

	public void takiptenCikar() {
		if (takipciSayisi > 0) {
			System.out.println("Arkadas cikarildi");
			this.takipciSayisi--;
			maviTikKontrol();
		} else {
			System.out.println("hic takipciniz yok");
		}
	}

	private void maviTikKontrol() {
		if (takipciSayisi > 5 && maviTik == false) {
			this.maviTik = true;
		} else {
			this.maviTik = false;
		}
	}
	public void bilgileriGoster() {
		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Profile [isim=" + isim + ", takipciSayisi=" + takipciSayisi + ", postSayisi=" + postSayisi
				+ ", maviTik=" + maviTik + "]";
	}
	
}
