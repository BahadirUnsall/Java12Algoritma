package lesson008;

import java.util.Arrays;

public class Question48 {

	public static void main(String[] args) {
		String[] array = { "100", "8", "7", "5", "99", "85", "100", "150", "150" };

		int enKucuk = Integer.MAX_VALUE;
		int enBuyuk = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (Integer.parseInt(array[i]) > enBuyuk) {
				enBuyuk = Integer.parseInt(array[i]);
			} else if (Integer.parseInt(array[i]) < enKucuk) {
				enKucuk = Integer.parseInt(array[i]);
			}

		}
		System.out.println("Büyük --> " + enBuyuk + "Küçük --> " + enKucuk);

		System.out.println("------------------------------");

		int[] arrayInt = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			arrayInt[i] = Integer.parseInt(array[i]);
		}

		int deger = Integer.parseInt("3");
		System.out.println("En Küçük-> " + arrayInt[0] + " En Büyük " + arrayInt[arrayInt.length - 1]);

	}
}
