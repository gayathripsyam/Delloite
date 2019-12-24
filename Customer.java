package Oops;

public class Customer {


	public int customerId;
	public String customerName;
	public String customerAddress;
	public int billAmount;
	
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public Customer() {   //default constructor
		customerId = 1000;
		customerName = "NA";
		customerAddress = "NA";
		billAmount = 500;
		System.out.println("Customer cons are called");
	}
	
	public Customer(int id, String name, String address, int billAmount) { //parametric constructor
		
		this.customerId = id;
		this.customerName = name;
		this.customerAddress = address;
		this.billAmount = billAmount;
		System.out.println("Parametrised cons are called");
	}
	
	public void printCustomer() {
		System.out.println("ID: "+ this.customerId);
		System.out.println("Name: " +this.customerName);
		System.out.println("Address: " +this.customerAddress);
		System.out.println("Bill: " +this.billAmount);
	}
	
}
