package lesson007;

import java.util.Arrays;

public class Question37 {

	public static void main(String[] args) {

		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14, 15, 78, 45, 98, 16, 78, 98 };

		int toplam = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] % 2 == 0) {
				System.out.println(sayilar[i] + " sayısı çifttir.");
			} else {
				System.out.println(sayilar[i] + " sayısı tektir.");
			}
			toplam += sayilar[i];
		}
		System.out.println(Arrays.toString(sayilar));
		System.out.println("dizi içerisindeki sayıların toplamı :" + toplam);

	}

}
