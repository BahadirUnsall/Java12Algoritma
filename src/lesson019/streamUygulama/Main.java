package lesson019.streamUygulama;


public class Main {

	public static void main(String[] args) {
		Market market = new Market();
		market.urunVeFiyatListesiniGoster();
		//market.sepeteUrunEkle();
		//market.sepeteUrunEkle();
		
		market.sepetiGoster();
		market.fiyatEllidenKucukOlanlarinOrtalamasi();
		
	}

}
