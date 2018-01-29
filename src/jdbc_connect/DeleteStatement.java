package jdbc_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//register the class
				Class.forName("com.mysql.jdbc.Driver");
				//connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/maaticstud", "root","");
				
				Statement stat = conn.createStatement();
				//fetch records
				stat.executeUpdate("DELETE FROM MAATIC WHERE id = 6");
				
				System.out.println("Query Updated:.....");
				
				conn.close();

	}

}
