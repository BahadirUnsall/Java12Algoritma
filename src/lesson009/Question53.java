package lesson009;

import java.util.Scanner;

public class Question53 {

	public static int topla() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("ilk sayıyı girin");
		int sayi1 = scanner.nextInt();
		scanner.nextLine();

		System.out.println("ikinci sayıyı girin");
		int sayi2 = scanner.nextInt();

		int sonuc = sayi1 + sayi2;

		return sonuc;
	}

	public static boolean ondanBuyukMu(int sum) {
		if (sum > 10) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		int toplamSonucu = topla();
		boolean check = ondanBuyukMu(toplamSonucu);
		System.out.println(check);
	}

}
