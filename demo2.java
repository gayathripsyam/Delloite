import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class demo2 {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DBConnection.makeConnection(); 
		Statement statement = connection.createStatement();
		String insertQuery = "insert into hr.customer values (101, 'Ajay', 'Mumbai', 2020)";
		int rowsAffected = statement.executeUpdate(insertQuery);
		System.out.println("Insert success with" +rowsAffected);
}
}