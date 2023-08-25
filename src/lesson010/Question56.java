package lesson010;

import java.util.Scanner;

public class Question56 {
	
	public static int bilgiAl() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yıl girin");
		int dogumYil = scanner.nextInt();
		return dogumYil;
	}

	public static int yasiBul(int dogumYil) {
		int yas = 2023 - dogumYil;
		return yas;
	}

	public static int hangiYuzyildaYasadi(int dogumYil) {
		int yuzYil = (dogumYil / 100) + 1;
		return yuzYil;
	}

	public static void bilgileriGoster() {
		
		int dogumYil = bilgiAl();
		int yas = yasiBul(dogumYil);
		int yuzYil = hangiYuzyildaYasadi(dogumYil);
		System.out.println("kullanıcı " + yas + "yaşında");
		System.out.println("kullanıcı " + yuzYil + ". yüzyılda yaşadı");
	}

	public static void main(String[] args) {

		bilgileriGoster();

	}

}
