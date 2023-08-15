package lesson002;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ortalamanızı girin.");
		double ort = scanner.nextDouble();

		if (ort > 100 || ort < 0) {
			System.out.println("Lütfen geçerli değerler girin");
		} else {
			if (ort >= 90) {
				System.out.println(ort + " ortalama ile AA aldınız");
			} else if (ort >= 80) {
				System.out.println(ort + " ortalama ile BB aldınız.");
			} else if (ort >= 70) {
				System.out.println(ort + " ortalama ile CC aldınız.");
			} else if (ort >= 60) {
				System.out.println(ort + " ortalama ile DD aldınız.");
			} else {
				System.out.println(ort + " ortalama ile FF aldınız.");
			}
		}

	}

}
