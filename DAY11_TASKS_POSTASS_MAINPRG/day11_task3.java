package addon2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class day11_task3 {

	

	public static void main(String [] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/demo";
		String username="root";
		String password="";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement war = con.createStatement();
	 String query="delete from student where id =01";
	 		
	     	war.executeUpdate(query);

		System.out.println("table create succesfully");
	}
}




		

	

