package lesson008;

import java.util.Arrays;

public class Question45 {

	public static void main(String[] args) {
		int[][] matris =

				{ { 56, 23, 678, 231, 5, 3 },

						{ 234, 21, 78, 26, 6, 4 },

						{ 654, 33, 32, 67, 2, 5 },

						{ 189, 35, 56, 89, 8, 6 },

						{ 189, 35, 56, 89, 8, 6 },

						{ 189, 33, 59, 89, 1, 7 },

				};

		int tekAdet = 0;

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					tekAdet++;
				}
			}
		}

		int[] dizi = new int[tekAdet];
		int index = 0;

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					dizi[index] = matris[i][j];
					index++;
				}
			}
		}

		System.out.println(Arrays.toString(dizi));

	}

}
