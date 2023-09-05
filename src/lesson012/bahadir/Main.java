package lesson012.bahadir;

public class Main {

	public static void main(String[] args) {

		Profile profile1 = new Profile();
		
		profile1.kullaniciAdi = "ahmet1";
		profile1.postOlustur("Ankarada Kahve");
		
		System.out.println(profile1.postSayisi);

		Profile profile2 = new Profile();

		profile2.postOlustur("istanbul");
		profile2.postOlustur("istanbul");
		profile2.postOlustur("istanbul");
		profile2.postOlustur("istanbul");

		System.out.println(profile2.postSayisi);
		
		System.out.println("------------------------------------------------");
		
		profile1.profilIsimGuncelle("RECEP");
		System.out.println(profile1.isim);
		
		System.out.println("------------------------------------------------");
		
		profile1.istegiKabulEt();
		profile1.istegiKabulEt();
		profile1.istegiKabulEt();
		profile1.istegiKabulEt();
		profile1.istegiKabulEt();
		profile1.istegiKabulEt();
		
		System.out.println("--------------------------");
		
		profile1.bilgileriGoster();

	}

}
