package lesson015;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListOrnek2 {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		ArrayList<Integer> ciftSayilar = new ArrayList<>();
		ArrayList<Integer> tekSayilar = new ArrayList<>();
		int randomSayi;
		
		for (int i = 0; i < 35; i++) {
			randomSayi = rnd.nextInt(35);
			if (randomSayi%2 ==0) {
				ciftSayilar.add(randomSayi);
			}
			else {
				tekSayilar.add(randomSayi);
			}
		}
		
		System.out.println(ciftSayilar);
		System.out.println("-------------------------");
		System.out.println(tekSayilar);
	}

}
