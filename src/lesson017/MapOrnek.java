package lesson017;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class MapOrnek {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("kelime girin");
		String kelime = scanner.nextLine();
		
		char harf;
//		for(int i = 0; i < kelime.length(); i++) {
//			harf = kelime.charAt(i);
//			map.put(harf, map.getOrDefault(harf, 0)+1);
////			if (map.containsKey(harf)) {
////				map.put(harf, map.get(harf)+ 1);
////			}else {
////				map.put(harf, 1);
////			}
//		}
		
		for (Character character : kelime.toCharArray()) {
			map.put(character, map.getOrDefault(character, 0)+1);
		}
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		map.forEach((k,v) -> System.out.println(k+ " - "+ v));
	
	}
	
	
}
