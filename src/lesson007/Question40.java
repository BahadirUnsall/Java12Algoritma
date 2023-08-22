package lesson007;

import java.util.Iterator;

public class Question40 {

	public static void main(String[] args) {

		int[] sayilar = { 0, 120, -5, -85, -256, 160, 1258, 81, 14 };

		int max = Integer.MIN_VALUE;

		int sayiKontrol = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < max && max > sayilar[i + sayiKontrol]) {
				System.out.println(sayilar[i]);
				sayiKontrol++;
			}

			for (int j = 0; j < sayilar.length; j++) {
				if (sayilar[j] > max) {
					max = sayilar[j];
				}
			}
		}

	}

}
