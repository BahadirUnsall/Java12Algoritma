package lesson024;

public class Kosucu extends Thread{
	//run metodu içerisinde 100 metre koşu yaptırıcaz 0-100 arasında her sayıda mesafemiz bir artacak
	//her 10 metrede bir çıktı verelim koşucu şu mesafede diye
	//methodun çalışma süresini hesaplayalım
	//daha mainde 2 tane koşucu oluşturalım ve başlatalım
	
	private long kosuSuresi;
	private String name;

	public Kosucu(String name) {
		this.name = name;
	}

	public long getKosuSuresi() {
		return kosuSuresi;
	}

	@Override
	public void run() {
		long baslangicSuresi = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i%10==0 && i!=0) {
				System.out.println(name+" "+ i+". metrede..");
			}else if(i==0) {
				System.out.println(name+" yarışa başladı.");
			}
		}
		long bitisSuresi = System.currentTimeMillis();
		kosuSuresi= bitisSuresi-baslangicSuresi;
		System.out.println(name+" "+(kosuSuresi)+" sürede koştu");
	}
	
}
