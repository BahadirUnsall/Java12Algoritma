package lesson024;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Taksi implements Runnable{

		private int id;
		private long hiz;
		private int musteriSayisi;
		
		private List<Integer> musteriler = new ArrayList<>();
		
		
		public Taksi(int id) {
			Random random = new Random();
			this.id = id;
			this.hiz = random.nextInt(5001);
		}
		
		@Override
		public void run() {
			
			while(!Durak.musteriKuyrugu.isEmpty()) {
				int musteriNo = Durak.musteriKuyrugu.poll();
				musteriler.add(musteriNo);
				System.out.println(id + ". Taksi --> " + musteriler.size() + ".müşterisini aldı-->" + musteriNo);
				
				try {
					Thread.sleep(hiz);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(id + ". Taksi Toplam "+musteriler.size() + " Muşteri aldı" );
		}
		
		

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public long getHiz() {
			return hiz;
		}

		public void setHiz(long hiz) {
			this.hiz = hiz;
		}

		public int getMusteriSayisi() {
			return musteriSayisi;
		}

		public void setMusteriSayisi(int musteriSayisi) {
			this.musteriSayisi = musteriSayisi;
		}

		public List<Integer> getMusteriler() {
			return musteriler;
		}

		public void setMusteriler(List<Integer> musteriler) {
			this.musteriler = musteriler;
		}

}
