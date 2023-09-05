package lesson012.product.utility;

import java.util.Random;

public class RandomGenerateId {
	public static int generateId() {
		Random rnd = new Random();
		int id = rnd.nextInt(10000);
		return id;
	}
}
