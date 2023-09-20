package lesson018;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSOutput;

public class StreamOrnek {

	public static void main(String[] args) {
		List<Integer> sayilar = new ArrayList<Integer>();
		
		sayilar.add(5);
		sayilar.add(55);
		sayilar.add(555);
		sayilar.add(5555);
		sayilar.add(543);
		sayilar.add(5343);
		
		List<Integer> bolunenSayilar = sayilar.stream().filter(sayi-> sayi%5==0).toList();
		System.out.println(bolunenSayilar);
		
		
		List<Integer> sayilarinKaresi = sayilar.stream().map(sayi->sayi*sayi).toList();
		System.out.println(sayilarinKaresi);
		
		System.out.println(bolunenSayilar.stream().count());
	}

}
