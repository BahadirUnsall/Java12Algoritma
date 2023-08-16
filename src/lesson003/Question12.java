package lesson003;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1.sayıyı girin");
		int sayi1 = scanner.nextInt();

		System.out.println("2.sayıyı girin");
		int sayi2 = scanner.nextInt();
		boolean tekMi = false;
		int toplam = sayi1 + sayi2;

		if (toplam % 2 == 0) {
			System.out.println("toplam:" + toplam + " " + !tekMi);
		} else {
			System.out.println("toplam:" + toplam + " " + tekMi);
		}

	}

}
