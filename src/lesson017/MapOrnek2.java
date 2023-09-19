package lesson017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapOrnek2 {

	public static void main(String[] args) {
		String[] ogrenci = {"ayse","zeynep","mehmet"};
		Integer[] notlar = {60,70,80};
		
		Map<String, Integer> veriMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < notlar.length; i++) {
			veriMap.put(ogrenci[i], notlar[i]);
		}
		
		for (Entry<String, Integer> enrty : veriMap.entrySet()) {
			System.out.println(enrty.getKey() + " - " + enrty.getValue());
		}
		
		String[] ogrenci2 = {"ayse","zeynep","mehmet"};
		Integer[][] notlar2 = {{60,70,80},{60,70,80},{60,70,80}};
		
		MapOrnek2 mapOrnek2 = new MapOrnek2();
		mapOrnek2.notlariDuzenle(ogrenci, notlar);
		
		mapOrnek2.notlariDuzenle(ogrenci, notlar2);
		
		System.out.println("---------------------------------------");
		
		notlariDuzenle2(ogrenci2, notlar2);
		
		
	}
	
	
	public <T,E> void notlariDuzenle(T[] ogrenci, E[]notlar) {
		Map<T, E> veriMap = new HashMap<T, E>();
		
		for (int i = 0; i < notlar.length; i++) {
			veriMap.put(ogrenci[i], notlar[i]);
		}
		
		for (Entry<T, E> enrty : veriMap.entrySet()) {
			System.out.println(enrty.getKey() + " - " + enrty.getValue());
		}
	}
	
	public <T,E> void notlariDuzenle(T[] ogrenci, E[][] notlar) {
		Map<T, E[]> veriMap2 = new HashMap<T, E[]>();
		
		for (int i = 0; i < notlar.length; i++) {
			veriMap2.put(ogrenci[i], notlar[i]);
		}
		
		for (Entry<T, E[]> enrty : veriMap2.entrySet()) {
			System.out.println(enrty.getKey() + " - " + Arrays.toString(enrty.getValue()));
		}
	}
	public static void notlariDuzenle2(String[] ogrenci, Integer[][] notlar) {
		Map<String, List<Integer>> veriMap = new HashMap<>();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < notlar.length; i++) {
			veriMap.put(ogrenci[i], new ArrayList<Integer>(Arrays.asList(notlar[i])));
			for (int j = 0; j < notlar[i].length; j++) {
				veriMap.get(ogrenci[i]).add(notlar[i][j]);
			}
		}
		
		for (Entry<String, List<Integer>> entry : veriMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		
	}

}
