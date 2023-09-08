package front;

import java.sql.Connection;
import java.sql.DriverManager;
public class Connectivity {
	static Connection con;
	public static Connection getConnection() throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/narayana";
	String user="root";
	String password="Narayana@227";
	 con=DriverManager.getConnection(url,user,password);
	return con;
	}
}
