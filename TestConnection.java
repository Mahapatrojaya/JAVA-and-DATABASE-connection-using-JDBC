package connectionTrial;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_intro","root","root");
		System.out.println("connected");
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
