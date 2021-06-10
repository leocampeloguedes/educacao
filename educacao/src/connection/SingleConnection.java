package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	
	private static String url = "jdbc:sqlserver://localhost:1433;databaseName=PUB;integratedSecurity=true";
	private static String drive = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String password = "admin";
	private static String user = "postgres";
	private static Connection connection = null;
	
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		// TODO Auto-generated constructor stub
		conectar();
	}
		
	private static void conectar() {
		try {
			if (connection == null) {
				Class.forName(drive);
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				System.out.println("Conectou com Sucesso!");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}
	
	
}
