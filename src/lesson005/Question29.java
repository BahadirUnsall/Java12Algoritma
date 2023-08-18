package lesson005;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bir kelime girin.");
		String kelime = scanner.nextLine();

		for (int i = 0; i <= kelime.length() - 1; i++) {
			System.out.println(kelime.charAt(i));
		}

	}

}
