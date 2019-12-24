package Oops;

public class Demo {

	public static void main(String[] args) {
		Customer c = new Customer();
		Customer d = new Customer(12, "Revi" , "Pune", 2345);
		c.printCustomer();
		d.printCustomer();
	}
}
