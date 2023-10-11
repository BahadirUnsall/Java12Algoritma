package lesson024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Durak {

		
		static List<Taksi> taksiList = new ArrayList<>();
		static Queue<Integer> musteriKuyrugu = new LinkedList<>();
		
		public Durak() {
			taksileriOlustur();
			musterileriOlustur();
		}
		
		public void taksileriOlustur() {
			for (int i = 1; i < 11; i++) {
				taksiList.add(new Taksi(i));
			}
		}
		public void musterileriOlustur() {
			for (int i = 1; i < 101; i++) {
				musteriKuyrugu.offer(i);
			}
		}
		
		public void taksileriGoreveGonder() {
			for (int i = 0; i < 10; i++) {
				Thread thread = new Thread(taksiList.get(i));
				thread.start();
			}
		}
		
		public static void main(String[] args) {
			Durak durak = new Durak();
			durak.taksileriGoreveGonder();
		}

}
