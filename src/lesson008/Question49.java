package lesson008;

public class Question49 {

	public static void main(String[] args) {
		int sayilar[] = { 1, 13, 13, 13, 2, 5, 13, 1 };

		int toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == 13 || (i > 0 && sayilar[i - 1] == 13)) {
				continue;
			} else {
				toplam += sayilar[i];
			}
		}
		System.out.println("Dizi içerisindeki sayıların toplamı: " + toplam);
	}

}
