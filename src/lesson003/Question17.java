package lesson003;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir sayı giriniz.");
		int sayi = scanner.nextInt();

		int toplam = 0;

		while (sayi != 0) {
			toplam = (sayi % 10) + toplam;
			sayi /= 10;
		}
		System.out.println(toplam);
	}

}
