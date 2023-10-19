package lesson026.factory;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hangi db'ye loglama yapıcaksınız?");
		
		String dbName = sc.nextLine();
		ILogger logger = DatabaseFactory.CreateDatabase(dbName);
		
	}

}
