package lesson024;

public class Calisan extends Thread{
	private String name;

	public Calisan(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " Çalışıyor");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	
}

//run metodumuz 10 kere dönücek her dönüşte isimi yazıp işleme devam ediyor diye yazdıralım.