package lesson003;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1'den 7'ye kadar bir sayı girin.");
		int gun = scanner.nextInt();

		switch (gun) {
		case 1, 2, 3, 4, 5 -> System.out.println(gun + " Hafta içi");

		case 6, 7 -> System.out.println(gun + " Hafta sonu");

		default -> System.out.println("Hatalı değer giriniz.");
		};
	}
}
