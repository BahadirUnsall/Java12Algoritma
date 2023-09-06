package lesson012.product.utility;

import java.util.Random;

public class RandomGenerateID {
	
	static Random random = new Random(); 
	public static String generateId() {
		
		int id = random.nextInt(10001);
		String randomId = Integer.toString(id);
		
		return randomId;
	}
	public static String generadeProductCode(String name) {
		String code = generateId();
		String productCode = name.substring(0,3) + code;
		return productCode;
	}
}
