
import java.sql.*;
import java.util.Properties;
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//Load appropriate class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded");
		
		//Obtain database connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","admin");
		System.out.println("Connected");
	
		//creating statement, executing query and reading results
		Statement stat = connection.createStatement();
		
		ResultSet res = stat.executeQuery("select hr.customer.* from hr.customer");
	    

		while(res.next())
		{
			System.out.print(res.getInt(1) + " ");
			System.out.print(res.getString(2) + " ");
			System.out.print(res.getString(3) + " ");
			System.out.println(res.getInt(4) + " ");
			
		}
	    
		stat.close();
		connection.close();
	}
}
