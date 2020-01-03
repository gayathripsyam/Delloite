import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtabledemo {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DBConnection.makeConnection(); 
		Statement statement = connection.createStatement();
		String pogo = "create table hr.salary (salary integer, bonus integer)";
	    statement.execute(pogo);
	    System.out.println("Done");
	}
}
