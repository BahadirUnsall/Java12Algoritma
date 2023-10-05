package lesson020;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {
	

	public static void main(String[] args) {
		System.out.println(bolme());
		
	}
	public static double bolme (){
		Scanner scanner = new Scanner(System.in);
		double bolum = 0.0;
		try {
			System.out.println("1.sayi: ");
			int sayi = scanner.nextInt();
			
			System.out.println("2.sayi: ");
			int sayi2 = scanner.nextInt();
			
			bolum = sayi /sayi2;
			return bolum;
		} catch (InputMismatchException e) {
			System.out.println("int deger giriniz.");
		}catch (ArithmeticException e) {
			System.out.println("0 ile bolunemez.");
		}catch (IllegalStateException e) {
			System.out.println("Scanner kapalı dikkat edin.");
		}
		catch (Exception e) {
			System.out.println("Sistemsel bir hata meydana geldi.");
		}
		return 0;
		
		
		
	}

}
