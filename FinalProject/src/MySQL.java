import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQL {

	static final String DB_URL = "jdbc:mysql://dbb.ctmmzlvkz5ab.ap-southeast-1.rds.amazonaws.com/111306047?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	static final String USER = "admin";
	static final String PASS = "12345678";

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
	
	public static Connection connectSQL() {
		Connection connection = null;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Load Database!");
		} catch (SQLException e) {
			Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, e);
		}
		return connection;
	}
	
//	public static Connection connectSQL() {
//		Connection connection = null;
//		try {
////			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://140.119.126.54:3333/finalProject", "BC", "");
//			System.out.println("Load Database!");
////		} catch (ClassNotFoundException e) {
////			Logger.getLogger(MySql.class.getName()).log(Level.SEVERE, null, e);
//		} catch (SQLException e) {
//			Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, e);
//		}
//		return connection;
//	}

}
