import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Productdelete{
	
 public static void main(String[] args) throws SQLException {
	Product product = new Product();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter product ID to be deleted");
	int ProductID = sc.nextInt();
	Connection connection = DBConnection.makeConnection();
	PreparedStatement statement = connection.prepareStatement("delete from hr.product where productId=?");
	statement.setInt(1, product.getproductId());
	
	statement.executeUpdate();
	
	System.out.println("Your data has been removed");
	
	statement.close();
	connection.close();

}
}
