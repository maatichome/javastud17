package jdbc_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//register the class
		Class.forName("com.mysql.jdbc.Driver");
		//connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/maaticstud", "root","");
		//create statement
		Statement stat = conn.createStatement();
		//fetch records
		stat.executeUpdate("INSERT INTO `maaticstud`.`maatic` (`username`, `password`) VALUES ('david', 'david123')");
		
		System.out.println("Query Updated:.....");
		//close statement
		conn.close();

	}

}
