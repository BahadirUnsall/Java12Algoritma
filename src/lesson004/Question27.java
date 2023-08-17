package lesson004;

import java.util.Iterator;
import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sayi;
		int max = 0;
		int min = 101;

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". sayıyı girin");
			sayi = scanner.nextInt();
			if(sayi<=0||sayi>=100) {
				System.out.println("Lütfen tekrar deneyiniz.");
				i--;
			}else {
				if (sayi > max) {
					max = sayi;
				}
				if (sayi < min) {
					min = sayi;
				}
			}
			
		}
		System.out.println("en büyük: " + max);
		System.out.println("en küçük: " + min);

	}

}
