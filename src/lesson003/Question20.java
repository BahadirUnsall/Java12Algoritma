package lesson003;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı girin");
		int sayi = scanner.nextInt();

		int hangiBasamak = 1;
		int basamakIcindekiDeger;

		while (sayi != 0) {
			basamakIcindekiDeger = sayi % 10;
			sayi = sayi / 10;
			System.out.println(hangiBasamak + "ler basamağı " + basamakIcindekiDeger);
			hangiBasamak *= 10;
		}
	}

}
