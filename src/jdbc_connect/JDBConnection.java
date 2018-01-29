package jdbc_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//register the class
	Class.forName("com.mysql.jdbc.Driver");
	//create connection
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/maaticstud", "root","");
	//create statement
	Statement stat = conn.createStatement();
	//fetch records
	ResultSet rs = stat.executeQuery("SELECT * FROM maatic");
	while(rs.next()) {
		int id = rs.getInt("id");
		String use = rs.getString("username");
		String pass = rs.getString("password");
		System.out.println(id + "\t" +use + "\t" +pass);
	}
	//close statement
	conn.close();
	}

}
