package lesson007;

import java.util.Arrays;
import java.util.Scanner;

public class Question35 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] ulkeler = { "Amerika", "Turkiye", "Almanya", "Hollanda", "Rusya" };

		for (int i = 0; i < ulkeler.length; i++) {
			if (ulkeler[i].endsWith("a")) {
				ulkeler[i] = "?";
				System.out.println(i + ". indexte değişti");
			}
		}
		System.out.println(Arrays.toString(ulkeler));

	}
}
