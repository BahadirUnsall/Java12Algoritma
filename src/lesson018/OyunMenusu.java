package lesson018;

import java.util.Scanner;

public class OyunMenusu {
	
	
	public static void Menu() {
		PlakaTahmin plakaTahmin = new PlakaTahmin();
		Scanner scanner = new Scanner(System.in);
		
		String message = "Şehir Tahmin Oyununa Hoşgeldiniz\n" + "Oyunumuzda toplam 3 tahmin hakkınız bulunmaktadır.\n"
				+ "1- Oyuna başla \n" + "2- Tahminlerim \n" + "0- Çıkış \n";
		
		int input;
		
		do {
			System.out.println("==================");
			System.out.println(plakaTahmin.getOyunSayisi() + " . Oyun");
			System.out.println(message);
			
			input = scanner.nextInt(); scanner.nextLine();
			
			switch (input) {
			case 1:
				plakaTahmin.tahminEt();
				break;
			case 2:
				plakaTahmin.tahminListem();
				break;
			case 0:
				System.out.println("Çıkış yapıldı.");
				break;
			default:
				break;
			}
			
		} while (input != 0);
	}
	
	
	
	
}
