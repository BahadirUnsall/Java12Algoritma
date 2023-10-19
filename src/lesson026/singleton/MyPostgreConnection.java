package lesson026.singleton;

public class MyPostgreConnection {
	
	private static MyPostgreConnection instance;
	
	private MyPostgreConnection() {
		
	}
	
	public static MyPostgreConnection getInstance() {
		if (instance == null) {
			instance = new MyPostgreConnection();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "MyPostgreConnection = " + hashCode();
	}
	
	
}
