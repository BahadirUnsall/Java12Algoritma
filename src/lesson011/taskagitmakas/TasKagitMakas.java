package lesson011.taskagitmakas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
	static Scanner scanner = new Scanner(System.in);
	static int secim;
	static int index;
	static String[] secenekler = { "TAS", "KAGIT", "MAKAS" };

	public static String pcSecim() {
		Random random = new Random();
		index = random.nextInt(secenekler.length);
		return secenekler[index];

	}

	public static String secimYap() {

		for (int i = 0; i < secenekler.length; i++) {
			System.out.println((i + 1) + "-" + secenekler[i]);
		}

		int secim = secimKontrol();

		return secenekler[secim - 1];

	}

	public static int secimKontrol() {
		int secim = 0;
		while (secim < 1 || secim > 3) {
			System.out.println("Lutfen 1-3 arasi secim yapin");
			secim = scanner.nextInt();

		}

		return secim;
	}

	public static void oyun() {
		String pcSecim = pcSecim();
		String secimim = secimYap();

		System.out.println("pc secimi : " + pcSecim);
		System.out.println("benim secim : " + secimim);

		if (pcSecim.equals(secimim)) {
			System.out.println("Beraberlik..");
		} else {
			switch (secimim) {
			case "TAS":
				if (pcSecim.equals("KAGIT")) {
					System.out.println("Kaybettik");
				} else {
					System.out.println("Kazandik");
				}
				break;

			case "KAGIT":
				if (pcSecim.equals("MAKAS")) {
					System.out.println("Kaybettik");
				} else {
					System.out.println("Kazandik");
				}
				break;

			case "MAKAS":
				if (pcSecim.equals("TAS")) {
					System.out.println("Kaybettik");
				} else {
					System.out.println("Kazandik");
				}
				break;

			default:
				break;
			}
		}

	}
}
