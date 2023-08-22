package lesson007;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		// Sayı tahmin uygulaması
		Scanner scanner = new Scanner(System.in);

		Random sayi = new Random();

		int[] tahminler = new int[100];
		int randomSayi = sayi.nextInt(20);
		int merakTahmin;
		for (int i = 0; i < tahminler.length; i++) {
			System.out.println(i + 1 + ". tahmini girin.");
			tahminler[i] = scanner.nextInt();
			if (tahminler[i] == randomSayi) {
				System.out.println(i + 1 + ". tahminde buldunuz");
				System.out.println("Kaçıncı tahmininizi bilmek istiyorsunuz.");
				merakTahmin = scanner.nextInt();
				System.out.println(tahminler[merakTahmin-1]);
				break;
			} else if (tahminler[i] < randomSayi) {
				System.out.println("Tahmininizi büyültün.");
			} else if (tahminler[i] > randomSayi) {
				System.out.println("Tahmininizi küçültün.");
			}
		}
		System.out.println("Tahminleriniz: \n" + Arrays.toString(tahminler));

		/*
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int randomSayi = random.nextInt(1,101);   
		System.out.println("random sayı--> "+randomSayi);
		boolean check = true;
		
		int tahminSayisi = 1;
		
		while(check == true) {
			System.out.println(tahminSayisi + ". Tahmininizi girin");
			int sayi = scanner.nextInt();
			if(sayi < randomSayi) {
				System.out.println("Tahmin Artır");
			}else if(sayi > randomSayi) {
				System.out.println("Tahmin Azalt");
			}
			else {
				System.out.println("Doğru Bildiniz " + tahminSayisi + ". Denemde buldunuz");
				check = false;
			}
			tahminSayisi ++;
		}
		
		---------------------------------------------------------------------------------------------
		---------------------------------------------------------------------------------------------
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int randomSayi = random.nextInt(1,101);   
		System.out.println("random sayı--> "+randomSayi);
		boolean check = true;
		
		int tahminSayisi = 1;
		
		while(check == true) {
			if(tahminSayisi == 6) {
				System.out.println("Üzgünüz hakkınız doldu");
				check = false;
				break;
			}
				System.out.println(tahminSayisi + ". Tahmininizi girin");
				int sayi = scanner.nextInt();
				tahminSayisi ++;
				
				if(sayi < randomSayi && tahminSayisi < 6) {
					System.out.println("Tahmin Artır");
				}else if(sayi > randomSayi && tahminSayisi < 6) {
					System.out.println("Tahmin Azalt");
				}
				else if(sayi == randomSayi){
					System.out.println("Doğru Bildiniz " + (tahminSayisi - 1) + ". Denemde buldunuz");
					check = false;
				}
		}
		
		 */
		
		
	}

}
