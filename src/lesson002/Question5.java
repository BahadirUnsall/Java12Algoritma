package lesson002;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double usdHali;
		double guncelDolarDegeri = 27.06;

		System.out.println("USD'ye çevirmek istediğiniz tl değerini girin.");
		double tl = scanner.nextDouble();

		usdHali = tl / guncelDolarDegeri;

		System.out.println(tl + " TL " + usdHali + " USD'dir.");
	}

}
