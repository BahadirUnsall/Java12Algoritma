package lesson004;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi = scanner.nextInt();
		int bolen = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				bolen += i;
			}
		}
		if (bolen == sayi) {
			System.out.println("Mükemmel sayıdır");
		} else {
			System.out.println("Mükemmel sayı değildir.");
		}

	}

}
