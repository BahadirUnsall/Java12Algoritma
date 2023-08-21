package lesson005;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		// 0123456789012345678901234
		String text = "Java     ,    Spring,  Postgre  ,React";

		/*
		 * for(int i=0;i<text.length();i++) { if(text.charAt(i) == ',') {
		 * System.out.println(); continue; } System.out.print(text.charAt(i)); }
		 */
		
		//boşlukları görmeden yazdıralım , String text = " Java,   Spring,Postgre,React";

		int index = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ',') {
				text.trim().charAt(i);
				System.out.println(text.substring(index, i));
				index = i + 1;
			}
		}
		System.out.println(text.substring(index));
		/*
		 * System.out.println(text.substring(0, 4));
		 * System.out.println(text.substring(5, 11));
		 * System.out.println(text.substring(12, 19));
		 * System.out.println(text.substring(20, 25));
		 */

	}

}
