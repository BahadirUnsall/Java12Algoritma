package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int deger1;
		int deger2;
		int carpim = 0;

		System.out.println("Çarpmak istediğiniz iki değeri girin.");

		deger1 = scanner.nextInt();
		deger2 = scanner.nextInt();

		carpim = deger1 * deger2;

		System.out.println("Çarpım işlemi sonucu: " + carpim);

	}

}
