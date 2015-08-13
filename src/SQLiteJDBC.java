import java.sql.*;
public class SQLiteJDBC {
static Connection conn=null;
public static Connection getSQLiteConnection() {
	try {
		Class.forName("org.sqlite.JDBC");
		conn=DriverManager.getConnection("jdbc:sqlite:resources/DataBase/parmeeda.sqlite");
		System.out.println("database connected");
	} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	return conn;
}
}
