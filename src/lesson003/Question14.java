package lesson003;

import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("1.sayiyi giriniz: ");
		int sayi1 = scanner.nextInt();
		System.out.println("2.sayiyi giriniz: ");
		int sayi2 = scanner.nextInt();
		System.out.println("3.sayiyi giriniz: ");
		int sayi3 = scanner.nextInt();

		if (sayi1 >= sayi2) {
			if (sayi2 >= sayi3)
				System.out.print("Üç sayının sıralaması: " + sayi1 + ">" + sayi2 + ">" + sayi3);
			else if (sayi3 >= sayi1)
				System.out.print("Üç sayının sıralaması: " + sayi3 + ">" + sayi1 + ">" + sayi2);
			else if (sayi1 > sayi3)
				System.out.print("Üç sayının sıralaması: " + sayi1 + ">" + sayi3 + ">" + sayi2);
		}
		if (sayi2 > sayi1) {
			if (sayi3 >= sayi2)
				System.out.print("Üç sayının sıralaması: " + sayi3 + ">" + sayi2 + ">" + sayi1);
			else if (sayi3 >= sayi1)
				System.out.print("Üç sayının sıralaması: " + sayi2 + ">" + sayi3 + ">" + sayi1);
			else if (sayi1 > sayi3)
				System.out.print("Üç sayının sıralaması: " + sayi2 + ">" + sayi1 + ">" + sayi3);
		}

	}

}
