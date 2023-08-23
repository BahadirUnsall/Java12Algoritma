package lesson008;

public class Question42 {

	public static void main(String[] args) {
		int[][] matris = new int[3][3];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				matris[i][j] = i + 1;
				System.out.print(matris[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
