package connectionTrial;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImageInDatabse {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/filehandling","root","root");
			String query="insert into images(pic) values(?)";
			PreparedStatement p=con.prepareStatement(query);
			FileInputStream fis=new FileInputStream("C:\\Users\\gopal\\Desktop\\jaya.jpg");
			p.setBinaryStream(1,fis,fis.available());
			p.executeUpdate();
			System.out.println("done !");
		}catch(Exception e) {
			System.out.println("error !!");
		}
	}

}
