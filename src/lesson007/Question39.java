package lesson007;

import java.util.Arrays;

public class Question39 {

	public static void main(String[] args) {
		int[] sayilar = { 0, 120, -5, -85, -256, 16, 1258, 81, 14 };
		System.out.println(Arrays.toString(sayilar));

		int negatifSayilar = 0;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < 0) {
				negatifSayilar++;
			}
		}

		int j = 0;

		int[] negatifArray = new int[negatifSayilar];
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] < 0) {
				negatifArray[j] = sayilar[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(negatifArray));

	}

}
