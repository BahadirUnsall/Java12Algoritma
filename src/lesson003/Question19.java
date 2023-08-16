package lesson003;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı giriniz.");
		int sayi = scanner.nextInt();
		int sayac = 1;
		int tekSayilar = 0;

		while (sayac <= sayi) {
			if (sayac % 2 != 0) {
				tekSayilar = tekSayilar + sayac;
			}
			sayac++;
		}
		System.out.println(tekSayilar);
	}

}
