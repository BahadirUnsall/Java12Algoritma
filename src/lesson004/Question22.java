package lesson004;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("sayi giriniz");
		int sayi = scanner.nextInt();
		int carpim;
		for (int i = 1; i <= 10; i++) {
			carpim =sayi* i;
			System.out.println(sayi + "*" + i + " = " + carpim);
		}
	}

}
