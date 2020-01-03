import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	
 public static void main(String[] args) throws SQLException {
	Customer customer =  new Customer();
	customer.accept();
	
	Connection connection = DBConnection.makeConnection();
	PreparedStatement statement = connection.prepareStatement("insert into hr.product values (?,?,?,?)");
	statement.setInt(1, customer.getCustomerId());
	statement.setString(2, customer.getCustomerName());
	statement.setString(3, customer.getCustomerAddress());
	statement.setInt(4, customer.getBillAmount());
	
	statement.executeUpdate();
	
	System.out.println(customer.getCustomerName() + ", your data has been entered");
}
}
