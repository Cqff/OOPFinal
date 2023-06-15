import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQL {

	static final String DB_URL = "jdbc:mysql://140.119.19.73:3315/111306047?useSSL=false";
	static final String USER = "111306047";
	static final String PASS = "sfe0e";

//	public  static Connection connectSQL() {
//		Connection connection = null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection(DB_URL, USER, PASS);
//			System.out.println("Load Database!");
//		} catch (ClassNotFoundException e) {
//			Logger.getLogger(MySql.class.getName()).log(Level.SEVERE, null, e);
//		} catch (SQLException e) {
//			Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, e);
//		}
//		
//		return connection;
//	}
	
//	public static Connection connectSQL() {
//		Connection connection = null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project", "BC", "");
//			System.out.println("Load Database!");
//		} catch (ClassNotFoundException e) {
//			Logger.getLogger(MySql.class.getName()).log(Level.SEVERE, null, e);
//		} catch (SQLException e) {
//			Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, e);
//		}
//		return connection;
//	}
	
	public static Connection connectSQL() {
		Connection connection = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Load Database!");
//		} catch (ClassNotFoundException e) {
//			Logger.getLogger(MySql.class.getName()).log(Level.SEVERE, null, e);
		} catch (SQLException e) {
			Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, e);
		}
		return connection;
	}

}
