package lesson021;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek01 {

	public static void main(String[] args) {
		
		String[] array = {"6","10","bc",null,"20"};
//		indexYazdir(array);
		try {
			toplamYazdir2(array);
		} catch (NullPointerCheck e) {
			
			e.printStackTrace();
		}
		System.out.println("Program devam ediyor");
	}
	public static void indexYazdir(String[] array) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("index girin");
			int index = sc.nextInt();sc.nextLine();
			
			System.out.println(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Yanlis index girdiniz.");
			
		}catch (InputMismatchException e) {
			System.out.println("index degerleri int olmalidir!");
		}catch (Exception e) {
			System.out.println("Beklenmedik bir hata!");
		}
		
	}
	
	public static void toplamYazdir(String[] array) {
		int hataSayisi = 0;
		int toplam = 0;
		for (int i = 0; i < array.length; i++) {
			int deger;
			try {
				deger = Integer.parseInt(array[i]);
				toplam+=deger;
			} catch (NumberFormatException e) {
				hataSayisi++;
			}
			
		}
		System.out.println("hata sayisi: " + hataSayisi);
		System.out.println("toplam: " + toplam);
	}
	
	public static void toplamYazdir2(String[] array) {
		int hataSayisi = 0;
		int toplam = 0;
		for (int i = 0; i < array.length; i++) {
			int deger;
			if (array[i].equals(null)) {
				throw new NullPointerException("null olamaz!!");
			}
			try {
				deger = Integer.parseInt(array[i]);
				toplam+=deger;
			} catch (NumberFormatException e) {
				hataSayisi++;
			}catch (NullPointerException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("hata sayisi: " + hataSayisi);
		System.out.println("toplam: " + toplam);
	}
	

}
