package lesson019.streamUygulama;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Market {
	List<Urun> productList;
	
	Map<String, Double> urunlerList;

	public Market() {
		urunleriOlustur();
	}
	public void urunleriOlustur() {
		EUrun[] urunler = EUrun.values();
		productList = Arrays.asList(urunler).stream().map(o-> new Urun(o.name(), o.getUrunFiyat())).collect(Collectors.toList());
	}
	
	
}
