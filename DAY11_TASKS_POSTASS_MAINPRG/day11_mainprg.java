package addon2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class day11_mainprg {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/demo";
        String username = "root";
        String password = "";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement war = con.createStatement();

        String query = "SELECT * FROM student";
        ResultSet rs = war.executeQuery(query);

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }

        
}}
