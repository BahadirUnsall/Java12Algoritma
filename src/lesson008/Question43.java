package lesson008;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		String[][] matris = new String[2][2];

		Scanner scanner = new Scanner(System.in);

		String kisi;

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				kisi = scanner.nextLine();
				matris[i][j] = kisi;
			}
			System.out.println((i+1)+".grup \n" + matris[i][0] + "\n"+matris[i][1]);
		}
		
	}
}
