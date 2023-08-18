package lesson004;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("1. sayı giriniz");
		int sayi3 = sc1.nextInt();

		String operator = "";
		System.out.println("işlem yapılacak sayı");
		double sayi = sc1.nextInt();
		System.out.println("yapılacak işlem");
		operator = sc1.next();

		double sonuc = sayi;

		while (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {

			System.out.println("işlem yapılacak sayı");
			double sayi2 = sc1.nextInt();
			switch (operator) {
			case "+":
				sonuc = sonuc + sayi2;

				break;
			case "-":
				sonuc = sonuc - sayi2;

				break;
			case "*":
				sonuc = sonuc * sayi2;

				break;
			case "/":
				sonuc = sonuc / sayi2;

				break;

			default:
				operator = "";
				break;
			}
			System.out.println("yapılacak işlem");
			operator = sc1.next();

		}
	}
}
