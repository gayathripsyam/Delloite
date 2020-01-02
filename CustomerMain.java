import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomerMain {

	
	public static void main(String[] args) {
		
		List<Customer> allCustomers = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(1,"Revi","Pune",5461);
		
		allCustomers.add(customer1);
		allCustomers.add(new Customer(2,"Rohanne","NY",3000));
		allCustomers.add(new Customer(3,"Rohe","NYfa",64614));

		System.out.println("Sort on 1)Name 2)Address 3)Bill Amount");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if(choice==3) {
			Collections.sort(allCustomers, new Namecomparator());
			System.out.println("After sorting according to bill amount: ");
			System.out.println(allCustomers);
		}
		
		if(choice==1) {
			Collections.sort(allCustomers, new Namecomparator());
			System.out.println("After sorting according to name: ");
			System.out.println(allCustomers);
		}
		
		if(choice==2) {
			Collections.sort(allCustomers,  new Addresscomparator());
			System.out.println("After sorting according to address: ");
			System.out.println(allCustomers);
		}
		
	}}
