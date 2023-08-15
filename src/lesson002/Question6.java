package lesson002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double ort = 0;

		System.out.println("Vize notunuzu giriniz.");
		int vizeNot = scanner.nextInt();

		System.out.println("Final notunuzu giriniz.");
		int finalNot = scanner.nextInt();

		ort = (vizeNot * 0.4) + (finalNot * 0.6);

		if (vizeNot < 0 || finalNot < 0) {
			System.out.println("- degerler girdiniz.");
		} else if (vizeNot > 100 || finalNot > 100) {
			System.out.println("100'den büyük değerler girdiniz.");
		} else if (ort >= 50) {
			System.out.println("Ortalamanız: " + ort + " Tebrikler geçtiniz.");
		} else {
			System.out.println("Ortalamanız: " + ort + " Kaldınız.");
		}

	}
}
