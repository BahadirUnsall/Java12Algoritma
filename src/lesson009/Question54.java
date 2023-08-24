package lesson009;

import java.util.Scanner;

public class Question54 {

	public static int basamakBul(int a) {
		int basamak = 1;
		while (a > 9) {
			a /= 10;
			basamak++;
		}
		return basamak;
	}

	public static int inputSayi() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı girin");
		int sayi = scanner.nextInt();
		return sayi;
	}

	public static void main(String[] args) {
		int sayi = inputSayi();
		int basamakSayisi = basamakBul(sayi);
		System.out.println(sayi + " sayısı " + basamakSayisi + " basamaklıdır");
	}

}
