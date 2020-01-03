

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewAbsolute {

	 public static void main (String[] args)       {
		 Connection connection = DBConnection.makeConnection();
		 try
		     {
			 
		  
		 Statement stmt =  connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  ResultSet.CONCUR_UPDATABLE);
		  
		 ResultSet rs = stmt.executeQuery("SELECT hr.customer.* FROM hr.Customer");
		 System.out.println("Before...");
		 System.out.println("CustomerId     CustomerName     CustomerAddress     BillAmount");
		 while (rs.next() ) {
		 System.out.println( rs.getInt(1) +"      "+rs.getString(2)+"      "+rs.getString(3)+"     "+rs.getInt(4));
		 }
		 //inserting a new row
		     rs.moveToInsertRow();
		     rs.updateInt("customerID", 3);
		     rs.updateString("customerName", "Geeta");
		     rs.updateString("customerAddress", "Banglore");
		     rs.updateInt("billAmount", 5000);
		     rs.insertRow();
		 //updating 2nd row – changing name to Seetha
		     rs.absolute(2); 
		       rs.updateString(2,"Seetha"); 
		     rs.updateRow(); 
		  
		  rs.beforeFirst();      
		 System.out.println("After...");
		 System.out.println("CustomerId     CustomerName     CustomerAddress     BillAmount");
		 while (rs.next() ) {
		 System.out.println( rs.getInt(1) +"      "+rs.getString(2)+"       "+rs.getString(3)+"     "+rs.getInt(4)); }}
		 catch (SQLException e) {  System.err.println ("Failed to connect to database" +e);
		 }
		 finally {if (connection != null)    {
		 try {connection.close ();} catch (SQLException e) { }     }         }     }
	
}