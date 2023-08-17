package lesson004;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("taban girin");
		int taban = scanner.nextInt();
		System.out.println("us girin");
		final int us = scanner.nextInt();
		int us2 = us;
		int sonuc = 1;

		do {
			if (us==0) {
				sonuc=1;
				break;
			}
			sonuc *= taban;
			us2--;
		} while (us2 > 0);
		System.out.println(taban+" ussu "+us+" = "+sonuc);
	}

}
