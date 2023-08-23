package lesson008;

import java.util.Scanner;

public class Question46 {

	public static void main(String[] args) {
		int[] sayilar = { 2, 2, -256, -256, 2, 1258, 2, 32 };
		int sayac = 0;

		boolean check = false;
		for (int i = 0; i < sayilar.length - 1; i++) {
			if (sayilar[i + 1] == 2 && sayilar[i] == 2) {
				check = true;
				sayac++;
			}
		}
		System.out.println(check);
		System.out.println("toplam " + sayac + " tane ardarda 2 var.");
	}
}
