package lesson004;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayı girin.");
		int sayi = scanner.nextInt();
		boolean isPrime = true;

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Asaldır.");
		} else {
			System.out.println("Asal değildir");
		}
	}

}
