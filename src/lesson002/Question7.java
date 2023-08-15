package lesson002;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir sayı giriniz.");

		int sayi = scanner.nextInt();

		if (sayi % 2 == 0) {
			System.out.println(sayi + " sayısı bir çift sayıdır.");
		} else {
			System.out.println(sayi + " sayısı bir tek sayıdır.");
		}

	}

}
