package lesson026.factory;

public class PostgreSql implements ILogger{
	
	private static PostgreSql instance;
	
	public PostgreSql() {
		
	}
	
	public static PostgreSql getInstance() {
		if (instance == null) {
			instance = new PostgreSql();
		}
		return instance;
	}

	@Override
	public String toString() {
		return "MyPostgreConnection = " + hashCode();
	}

	@Override
	public void logToDatabase(String ex) {
	}
	
	
}
