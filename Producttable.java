import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Producttable{
	public static void main(String[] args) throws SQLException {
		Product product = new Product();
		Connection connection = DBConnection.makeConnection();

		Statement stat = connection.createStatement();
		ResultSet res = stat.executeQuery("select * from hr.product");
		while(res.next())
		{
			System.out.print(res.getInt(1) + " ");
			System.out.print(res.getString(2) + " ");
			System.out.print(res.getInt(3) + " ");
			System.out.println(res.getInt(4) + " ");
			
		}
	
}}

