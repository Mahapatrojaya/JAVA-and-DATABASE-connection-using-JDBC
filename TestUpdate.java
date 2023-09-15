package connectionTrial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_intro";
			String user="root";
			String password="root";
			Connection connection=DriverManager.getConnection(url,user,password);
			Statement statement = connection.createStatement();
			
			String sql="update student set name='mohapatr', email='jspider@122',course='java' where id=12";
			int res=statement.executeUpdate(sql);
			System.out.println("no of rows got updated="+res);
			connection.close();
			}catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();

}
	}
}

