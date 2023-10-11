package lesson024;

public class RunnerKosucu {

	public static void main(String[] args) {
		Kosucu mehmet = new Kosucu("Mehmet");
		Kosucu ahmet = new Kosucu("Ahmet");
		
		mehmet.start();
		ahmet.start();
		try {
			mehmet.join();
			ahmet.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (ahmet.getKosuSuresi()>mehmet.getKosuSuresi()) {
			System.out.println("Mehmet yarışı kazandı..");
		}else if (ahmet.getKosuSuresi()<mehmet.getKosuSuresi()) {
			System.out.println("Ahmet yarışı kazandı.");
		}else {
			System.out.println("Beraberlik..");
		}
	}
	

}
