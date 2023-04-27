import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQL {

	static final String DB_URL = "jdbc:mysql://140.119.19.73:3315/110306036?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	static final String USER = "110306036";
	static final String PASS = "f7om6";

//	public  static Connection connectSQL() {
//		Connection connection = null;
//		try {
////			Class.forName("com.mysql.jdbc.Driver");
//			connection = DriverManager.getConnection(DB_URL, USER, PASS);
//			System.out.println("Load Database!");
////		} catch (ClassNotFoundException e) {
////			Logger.getLogger(MySql.class.getName()).log(Level.SEVERE, null, e);
//		} catch (SQLException e) {
//			Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, e);
//		}
//		
//		return connection;
//	}
	
	public static Connection connectSQL() {
		Connection connection = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/final_project", "BC", "");
			System.out.println("Load Database!");
//		} catch (ClassNotFoundException e) {
//			Logger.getLogger(MySql.class.getName()).log(Level.SEVERE, null, e);
		} catch (SQLException e) {
			Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, e);
		}
		return connection;
	}

}