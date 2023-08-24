package lesson009;

import java.util.Arrays;
import java.util.Scanner;

public class Question50 {

	public static String englishVersion(String kelime, String[] array1, String[] array2) {
		for (int i = 0; i < array1.length; i++) {
			if (kelime.contains(array1[i])) {
				kelime = kelime.replaceAll(array1[i], array2[i]);
			}
		}
		return kelime;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

		System.out.println("Kelime girin");
		String kelime = scanner.nextLine();

		System.out.println(englishVersion(kelime, turkceKarakter, ingilizceKarakter));
	}
}
