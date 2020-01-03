import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Productadd{
	
 public static void main(String[] args) throws SQLException {
	Product product = new Product();
	product.accept();
	
	Connection connection = DBConnection.makeConnection();
	PreparedStatement statement = connection.prepareStatement("insert into hr.customer values (?,?,?,?)");
	statement.setInt(1, product.getproductId());
	statement.setString(2, product.getproductName());
	statement.setInt(3, product.getproductPrice());
	statement.setInt(4, product.getproductQuantity());
	
	statement.executeUpdate();
	
	System.out.println("Your data has been entered");
}
}
