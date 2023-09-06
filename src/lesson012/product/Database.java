package lesson012.product;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private static List<Product> dataBase = new ArrayList<>();

	public static List<Product> getDatabase() {
		return dataBase;
	}	
	
}
