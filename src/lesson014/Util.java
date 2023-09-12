package lesson014;

import java.util.Scanner;

public class Util {
	static Scanner scanner = new Scanner(System.in);
	
	static public String getStringValue(String message) {
		System.out.println(message);
		String value = scanner.nextLine();
		return value;
	}
	static public double getDoubleValue(String message) {
		System.out.println(message);
		double value = scanner.nextDouble();
		scanner.nextLine();
		return value;
	}
	static public int getIntValue(String message) {
		System.out.println(message);
		int value = scanner.nextInt();
		scanner.nextLine();
		return value;
	}
}
