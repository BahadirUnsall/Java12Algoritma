package lesson002;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final double pi = 3.14;
		double alan = 0;
		double cevre = 0;

		System.out.println("Yarı çap giriniz");
		int r = scanner.nextInt();

		if (r <= 0) {
			System.out.println("Lütfen pozitif bir sayı giriniz.");
		} else {
			alan = pi * (r * r);
			cevre = 2 * pi * r;

			System.out.println("Dairenin alanı: " + alan);
			System.out.println("Dairenin çevresi: " + cevre);
		}
	}

}
