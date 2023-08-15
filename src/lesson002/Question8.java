package lesson002;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. kenarı girin");
		int kenar1 = scanner.nextInt();
		
		System.out.println("2. kenarı girin");
		int kenar2 = scanner.nextInt();
		
		System.out.println("3. kenarı girin");
		int kenar3 = scanner.nextInt();

		if (kenar1 == kenar2 && kenar2 == kenar3) {
			System.out.println("Eşkenar üçgendir.");
		} else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
			System.out.println("İkizkenar üçgendir.");
		} else {
			System.out.println("Çeşitkenar üçgendir.");
		}
	}
}
