package lesson026.factory;

public class DatabaseFactory{

	public static ILogger CreateDatabase(String dbName) {
		switch (dbName) {
		case "Postgre":return new PostgreSql();
		case "mongo":return new MongoDB();
		default:
			break;
		}
		return null;
	}
	
}
