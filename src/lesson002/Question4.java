package lesson002;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sayi1;
		int sayi2;

		System.out.println("Toplamak istediğiniz sayıları sırasıyla giriniz.");
		sayi1 = scanner.nextInt();
		sayi2 = scanner.nextInt();

		if (sayi1 > sayi2) {
			System.out.println("Büyük olan sayı : " + sayi1);
		} else if (sayi1 == sayi2) {
			System.out.println("İki sayıda eşittir.");
		} else {
			System.out.println("Büyük olan sayı: " + sayi2);
		}

	}

}
