package lesson003;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mailKod = 123456;
		int telefonKod = 654321;

		System.out.println("Mailinize gelen kodu yazın.");
		int gelenKodMail = scanner.nextInt();

		System.out.println("Telefonunuza gelen kodu yazın.");
		int gelenKodTel = scanner.nextInt();

		if (gelenKodMail == mailKod && telefonKod == gelenKodTel) {
			System.out.println("Sisteme kayıt oldunuz.");
		} else if (gelenKodMail != mailKod && telefonKod != gelenKodTel) {
			System.out.println("Kodları yanlış girdiniz.");
		} else if (gelenKodMail != mailKod) {
			System.out.println("Girilen mail kodu hatalıdır.");
		} else if (telefonKod != gelenKodTel) {
			System.out.println("Girilen telefon kodu hatalıdır.");
		} else {
			System.out.println("Tekrar deneyiniz.");
		}
	}

}
