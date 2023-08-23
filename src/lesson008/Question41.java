package lesson008;

public class Question41 {

	public static void main(String[] args) {
		
		//BilgeAdam
		//AdvancedJava
		String[][] matris1 = { { "Bilge", "Advanced" }, { "Postgre", "Data" } };


        String[][] matris2 = { { "Adam", "Java" }, { "SQL", "Base" } };
        
        String matris3;
        for (int i = 0; i < matris1.length; i++) {
			for (int j = 0; j < matris1.length; j++) {
				matris3 = matris1[i][j]+ matris2[i][j];
				System.out.println(matris3);
			}
		}

	}

}
