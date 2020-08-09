package connection.java.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	public static Connection getcon() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/server","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	
	}

	/*public static Connection getcon() {
		try {
			Class.forName("com.jdbc.mysql.Driver");
			return DriverManager.getConnection("mysql:jdbc://localhost:3306/homedb1","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}*/
}