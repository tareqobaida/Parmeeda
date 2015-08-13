import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
	public static void main(String[] args) {
		Connection conn=null;
    Statement stmt=null;
    String sql="SELECT * FROM Products";
    try {
    	conn=SQLiteJDBC.getSQLiteConnection();
		stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("Category")+"|"+rs.getString("Product")+"|"+rs.getFloat("Price"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
finally {
	try {
		if(stmt!=null )stmt.close();
		if(conn!=null)conn.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}

}
	}

}
