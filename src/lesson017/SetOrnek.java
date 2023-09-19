package lesson017;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Set<Character> tekrarEdenler = new HashSet<Character>();
		Set<Character> tekrarEtmeyenler = new HashSet<Character>();
		
		System.out.println("Kelime girin: ");
		String kelime = scanner.nextLine();
		
		for (Character character : kelime.toCharArray()) {
			if (tekrarEtmeyenler.remove(character)) {
				tekrarEdenler.add(character);
			}else {
				tekrarEtmeyenler.add(character);
			}
		}
		
		System.out.println("tekrar edenler " + tekrarEdenler);
		System.out.println("tekrar etmeyenler " + tekrarEtmeyenler);
	}

}
