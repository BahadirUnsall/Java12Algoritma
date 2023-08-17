package lesson004;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("İstediğiniz işlemi yazınız. sadece ( * , /, +, -)");
		String secenek = scanner.nextLine();

		double sonuc = 0;
		System.out.println("1.sayıyı girin");
		int sayi1 = scanner.nextInt();
		System.out.println("2.sayıyı girin");
		int sayi2 = scanner.nextInt();

		switch (secenek) {
		case "+":
			sonuc = sayi1 + sayi2;
			break;
		case "-":
			sonuc = sayi1 - sayi2;
			break;
		case "*":
			sonuc = sayi1 * sayi2;
			break;
		case "/":
			sonuc = sayi1 / sayi2;
			break;
		default:
			System.out.println("Yanlış girdiniz.");
			break;
		}
		System.out.println(" = " + sonuc);

	}

}
