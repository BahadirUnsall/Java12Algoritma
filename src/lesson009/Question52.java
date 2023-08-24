package lesson009;

import java.util.Scanner;

public class Question52 {

	public static String isimAl() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("İsim giriniz");
		String isim = scanner.nextLine();
		return isim;
	}

	public static String SoyisimAl() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("soyisim giriniz");
		String soyIsim = scanner.nextLine();
		return soyIsim;
	}

	public static void bilgileriYazdir(String isim, String soyIsim) {
		System.out.println(isim + soyIsim);
	}

	public static void main(String[] args) {

		String isim = isimAl();
		String soyIsim = SoyisimAl();
		bilgileriYazdir(isim, soyIsim);

	}

}
