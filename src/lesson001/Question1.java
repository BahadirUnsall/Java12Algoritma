package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
		
		String isim;
		String soyIsim;
		
		System.out.println("İsim girinız");
		isim = scanner.next();
		
		System.out.println("Soyisim giriniz");
		soyIsim = scanner.next();		
		
		System.out.println("İsim ve Soyisminiz: " + isim +" " + soyIsim);
		
	}

}
