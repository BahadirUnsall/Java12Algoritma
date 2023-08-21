package lesson006;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean kontrol = true;
		while (kontrol) {
			System.out.println("====String işlemleri====");
			System.out.println("1- Harf Saydırma");
			System.out.println("2- Harf Değiştirme");
			System.out.println("3- Polindrome kontrol");
			System.out.println("4- Aralara soru işaretleri ekleme");
			System.out.println("5- Kelimenin sonuna 3 tane yıldız veya nokta atma");
			System.out.println("6- Kelimenin sonua kadar yıldız veya nokta atma");
			System.out.println("0- Çıkış");

			int secim = scanner.nextInt();

			switch (secim) {
			case 1:
				int sayac = 0;
				String index = "";
				System.out.println("Kelime giriniz:");
				String kelime = scanner.next();

				System.out.println("Hangi harfi saymak istiyosunuz ");
				String harf = scanner.next();

				if (!kelime.contains(harf)) {
					System.out.println("Aradıgınız harf kelimede yoktur");
				} else {
					for (int i = 0; i < kelime.length(); i++) {
						if (kelime.charAt(i) == harf.charAt(0)) {
							sayac++;
							index += i + ",";
						}
					}
					System.out.println(harf + " harfi kelime içinde " + sayac + " adet bulunuyor");
					System.out.println(harf + " değerinin indexleri ==> " + index.substring(0, index.length() - 1));
				}
				break;
			case 0:
				kontrol = false;
				break;
			case 2:
				System.out.println("Kelime giriniz:");
				kelime = scanner.next();

				System.out.println("Hangi harfi değiştirmek istiyosunuz ");
				harf = scanner.next();

				System.out.println("Hangi harf ile değiştirmek istiyosunuz ");
				String harf1 = scanner.next();

				if (!kelime.contains(harf)) {
					System.out.println(harf + " Mevcut değil");
				} else {
					kelime = kelime.replace(harf, harf1);

				}
				System.out.println(kelime);
				break;
			case 3:
				System.out.println("Kelime giriniz:");
				kelime = scanner.next();

				String tersi = "";

				for (int i = 0; i < kelime.length(); i++) {
					tersi = kelime.charAt(i) + tersi;
				}
				if (kelime.equals(tersi)) {
					System.out.println("polindrom");
				} else {
					System.out.println("polindrom değildir.");
				}
			case 4:/*
					 * System.out.println("Kelime giriniz:"); kelime = scanner.next();
					 * 
					 * String sonuc = "";
					 * 
					 * for (int i = 0; i < kelime.length(); i++) { sonuc = sonuc + kelime.charAt(i)
					 * + "?"; } System.out.println(sonuc.subSequence(0, sonuc.length() - 1));
					 */

				StringBuilder sb = new StringBuilder();

				System.out.println("Kelime giriniz:");
				kelime = scanner.next();

				for (int i = 0; i < kelime.length(); i++) {
					sb.append(kelime.charAt(i) + "?");
				}
				System.out.println(sb.substring(0, sb.length() - 1));
				break;
			case 5:
				System.out.println("Kelime giriniz:");
				kelime = scanner.next();

				String yeniKelime = kelime.substring(0, 3) + "...";

				System.out.println(yeniKelime);
				break;
			case 6:
				System.out.println("Kelime giriniz:");
				kelime = scanner.next();

				String yeniKelime1 = kelime.substring(0, 3);

				for (int i = 3; i < kelime.length(); i++) {
					yeniKelime1 += ".";
				}

				System.out.println(yeniKelime1);
				break;
			default:
				break;
			}
		}
	}

}
