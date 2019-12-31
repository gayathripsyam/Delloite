import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo7{
	
int num1, num2;
Scanner sc = new Scanner(System.in);
public void display() {
	 System.out.println("Welcome to display");
	 try {
	 System.out.println("Enter the first number");
	 num1 = sc.nextInt();
	 System.out.println("Enter the first number");
	 num2 = sc.nextInt();
	 }
	 catch (InputMismatchException e) {
		 System.out.println("Enter a number");
	 }
	 catch (ArithmeticException e) {
		 System.out.println("Do not enter 0");
	 }
	 int result=num1/num2;
	 System.out.println(result);
}

public static void main(String[] args) {
	System.out.println("MAIN STARTED");
	Demo7 d1 = new Demo7();
	d1.display();
	System.out.println("MAIN ENDED");
}

}