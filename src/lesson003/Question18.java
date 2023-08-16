package lesson003;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı girin.");
		int sayi = scanner.nextInt();

		boolean kontrol = true;

		while (kontrol) {
			if (sayi % 5 == 0) {
				sayi /= 5;
				if (sayi == 1) {
					System.out.println("5'in kuvvetidir.");
					kontrol = false;
				}
			} else {
				System.out.println("5'in kuvveti değildir.");
				kontrol = false;
			}
		}
	}

}
