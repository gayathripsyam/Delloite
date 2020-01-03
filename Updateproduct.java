
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Updateproduct{
	public static void main(String[] args) throws SQLException {
		Product product = new Product();
		product.Updateproduct();
		Connection connection = DBConnection.makeConnection();

		PreparedStatement statement = connection.prepareStatement("update hr.product set  productName=?, productPrice=?, productQuantity=? where productId=?");

		statement.setInt(3, product.getproductPrice());
		statement.setInt(4, product.getproductQuantity());
		statement.setString(2, product.getproductName());
		statement.setInt(1, product.getproductId());
		
		statement.executeUpdate();
		System.out.println("Your data has been entered");
		
	statement.close();
	connection.close();
	}	
		
}