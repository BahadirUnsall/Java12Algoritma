package lesson001;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int urunFiyat;
		double hamFiyat;
		double vergiOrani = 1.20;
		double karOrani = 1.15;
		
		System.out.println("Ürünün fiyatını girin.");
		
		urunFiyat = scanner.nextInt();
		
		hamFiyat = urunFiyat/ (vergiOrani * karOrani);
		System.out.println("Ürünün ham fiyatı: " + hamFiyat );
		

	}

}
