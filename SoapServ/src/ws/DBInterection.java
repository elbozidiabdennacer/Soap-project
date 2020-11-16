package ws;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBInterection {

	static Connection con;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vent_livres", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		return con;
	}
}
