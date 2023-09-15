package connectionTrial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class TestDelete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc_intro";
			String user="root";
			String pass="root";
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			String sql="delete from student where id=301";
			boolean res=st.execute(sql);
			System.out.println(res);
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
