package lesson023;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MarsApplication {
	public static void main(String[] args) {
		hesapla();
	}
	public static void hesapla() {
		try {
			List<String> lines = Files.readAllLines(Path.of("mars.txt"));
			System.out.println("Satir sayisi: " + lines.size());
			
			int toplamKarakterSayisi = 0;
			int toplamKelimeSayisi = 0;
			Map<String, Integer> tekrarEdenKelimeler = new HashMap();
			
			for (String line : lines) {
				toplamKarakterSayisi += line.replace(" ", "").length();
				toplamKelimeSayisi += line.split(" ").length;
				for (String kelime : lines) {
					kelime = kelime.toLowerCase().replaceAll("[^a-zA-Z]", "");
					if (!kelime.isEmpty()) {
						tekrarEdenKelimeler.put(kelime, tekrarEdenKelimeler.getOrDefault(kelime, 0)+1);
					}
				}
			}
			System.out.println("Toplam Karakter Sayisi -> " + toplamKarakterSayisi);
			System.out.println("Toplam Kelime Sayisi -> " + toplamKelimeSayisi);
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
