package lesson005;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Kelime girin");
		String kelime = scanner.nextLine();

		int eSayisi = 0;

		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == 'e') {
				eSayisi += 1;
			}
		}
		System.out.println(eSayisi + " tane e var.");
	}

}
