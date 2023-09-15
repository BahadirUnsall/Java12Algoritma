package lesson015;

import java.util.ArrayList;

public class ArrayListOrnek1 {
	
	public static void main(String[] args) {
		ArrayList<String> sehirler = new ArrayList<>();
		sehirler.add("istanbul");
		sehirler.add("Ankara");
		sehirler.add("izmir");
		sehirler.add("adana");
		sehirler.add("antalya");
		
		degerDegistirme(sehirler);
		//5.437.964.650
		
	}
	public static void degerDegistirme(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String deger = list.get(i).toLowerCase();
			if (deger.startsWith("an")) {
				deger = deger.replace("an", "xxx");
				System.out.println(deger);
			}
		}
	}
	
}
