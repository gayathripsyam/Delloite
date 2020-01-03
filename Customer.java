import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable,Comparable<Customer>{
	
	private int customerId;
	private String customerName;
	private String customerAddress;
	private transient int billAmount;
	
	@Override
	public int compareTo(Customer o) {
		if(this.getBillAmount() > o.getBillAmount())
		return 0;
		else
			return -1;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.billAmount = billAmount;
	}

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

	
	
	public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer id : "); customerId = scanner.nextInt();
        System.out.println("Enter customer name : "); customerName = scanner.next();
        System.out.println("Enter customer address : "); customerAddress = scanner.next();
        System.out.println("Enter bill amount : "); billAmount = scanner.nextInt();
    }
	
	public void updateCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer id to update : "); customerId = scanner.nextInt();
        System.out.println("Enter new customer name : "); customerName = scanner.next();
        System.out.println("Enter new customer address : "); customerAddress = scanner.next();
        System.out.println("Enter new bill amount : "); billAmount = scanner.nextInt();
    }
	
	@Override
	public String toString() {
		return "\n Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
	}

	
}
