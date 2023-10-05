package lesson019.streamUygulama;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Market {
	Scanner scanner = new Scanner(System.in);
	
	List<Urun> productList;
	
	Map<String, Double> urunlerList;
	
	Map<String, Integer> sepet = new HashMap<String, Integer>();

	public Market() {
		urunleriOlustur();
		urunlerListesiOlustur();
	}
	private void urunleriOlustur() {
		EUrun[] urunler = EUrun.values();
		productList = Arrays.asList(urunler).stream().map(o-> new Urun(o.name(), o.getUrunFiyat())).collect(Collectors.toList());
	}
	private void urunlerListesiOlustur() {
		urunlerList = productList.stream().collect(Collectors.toMap(k->k.getName(), k -> k.getPrice()));
	}
	public void urunVeFiyatListesiniGoster() {
		urunlerList.forEach((k,v) -> System.out.println(k +" "+ v));
	}
	
	public void sepeteUrunEkle() {
		System.out.println("Hangi ürünü almak istiyorsunuz");
		String word = scanner.nextLine();
		
		if (urunlerList.containsKey(word)) {
			if (!sepet.containsKey(word)) {
				sepet.put(word, 1);
				System.out.println("sepete eklendi");
			}else {
				sepet.put(word, sepet.get(word + 1));
			}
		}else {
			System.out.println("Sepette urun bulunmamaktadır.");
		}
		
	}
	public void sepetiGoster() {
		System.out.println("Sepetiniz: ");
		sepet.forEach((k,v) -> System.out.println(k + " " + v));
	}
	
	public void fiyatEllidenKucukOlanlarinOrtalamasi() {
		//Buda başka bir kullanım.
		/*double ort = productList.stream().filter(o->o.getPrice()<50).mapToDouble(Urun::getPrice)
				.average()
				.orElse(0.0);*/
		
		double result = productList.stream().filter(o->o.getPrice()<50).collect(Collectors.averagingDouble(Urun::getPrice));
		
		System.out.println("50 den küçük olanların ortalaması : " + result);
	}
	
}
