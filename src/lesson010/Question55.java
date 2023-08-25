package lesson010;

import java.util.Scanner;

public class Question55 {

	public static boolean asalMi(int sayi) {
		boolean asalMi = true;
		if (sayi < 2) {
			asalMi = false;
		} else {
			for (int i = 2; i < sayi; i++) {
				if (sayi % i == 0) {
					asalMi = false;
					break;
				}
			}
		}
		return asalMi;
	}

	public static void asalGoster(int sayi) {
		for (int i = 0; i < sayi; i++) {
			boolean asalMi = asalMi(i);
			if (asalMi) {
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kaça kadar asal görmek istiyorsunuz ? ");
		int sayi = scanner.nextInt();

		asalGoster(sayi);
	}
}
