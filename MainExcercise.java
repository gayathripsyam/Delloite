
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MainExcercise{
	public static void main(String[] args) throws SQLException {
		Customer customer = new Customer();
		customer.updateCustomer();
		
		
		Connection connection = DBConnection.makeConnection();

		PreparedStatement statement = connection.prepareStatement("update hr.customer set  customerName=?, customerAddress=?, billAmount=? where customerId=?");

		statement.setInt(4, customer.getCustomerId());
		statement.setInt(3, customer.getBillAmount());
		statement.setString(1, customer.getCustomerName());
		statement.setString(2, customer.getCustomerAddress());
		
		statement.executeUpdate();
		System.out.println(customer.getCustomerName() + ", your data h been recorded!");   
		}
		
		
}