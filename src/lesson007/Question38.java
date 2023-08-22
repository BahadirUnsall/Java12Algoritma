package lesson007;

public class Question38 {

	public static void main(String[] args) {
		int[] array = { 1, 4, 4, 2, 4, 4, 2, 2, 9, 2, 8 };

		int kacIki = 0;
		int kacDort = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				kacIki++;
			} else if (array[i] == 4) {
				kacDort++;
			}
		}

		System.out.println(kacIki + " tane 2 sayısı var.");
		System.out.println(kacDort + " tane 4 sayısı var.");

		if (kacIki < kacDort) {
			System.out.println("4 sayısı daha fazladır.");
		} else if (kacIki > kacDort) {
			System.out.println("2 sayısı daha fazladır.");
		} else {
			System.out.println("eşit sayıdalar.");
		}
	}

}
