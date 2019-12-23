package Oops;

import java.util.Scanner;

public class Employee {

	public int employeeid;
	public String employeename;
	public String employeeaddress;
	public int Salary;
	
	public void takeSalary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		employeeid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee name");
		employeename = sc.nextLine();
		System.out.println("Enter Employee address");
		employeeaddress = sc.nextLine();
		System.out.println("Enter Employee Salary");
		Salary = sc.nextInt();
	}
	
	public void printSalary() {
		System.out.println("Employee ID: " + employeeid);
		System.out.println("Employee name: " + employeename);
		System.out.println("Employee address: " + employeeaddress);
		System.out.println("Employee Salary: " + Salary );
	}
}
