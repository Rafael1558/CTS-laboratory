package ro.ase.csie.cts.lab5.dp.singleton;

public class DBConnection {
	String socket;
	String schema;
	
	private static DBConnection dbConnection = null;

	static {
		System.out.println("Loading database connection string");
	}
	

	{

		System.out.println("Init connection string");
	}
	            
	private DBConnection() {
		System.out.println("Creating a DB connection");

	}

	private DBConnection(String socket, String schema) {
		super();
		this.socket = socket;
		this.schema = schema;
	}
	
	
	public static DBConnection getDBConnection() {
		if(DBConnection.dbConnection == null) {
			dbConnection = new DBConnection();
		}
		return DBConnection.dbConnection;
	}
	
}