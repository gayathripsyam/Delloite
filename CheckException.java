import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckException{
	
int num1, num2;
Scanner sc = new Scanner(System.in);
public void display() throws Exception {
	 System.out.println("Welcome to display");
	 Thread.sleep(1000);
	 System.out.println("Bye");
}
public void display2() throws InterruptedException {
	 System.out.println("Welcome to display, Hello");
	 Thread.sleep(1000);
	 System.out.println("Bye Hello");
}
public static void main(String[] args) throws Exception {
	System.out.println("MAIN STARTED");
	CheckException d1 = new CheckException();
	CheckException d2 = new CheckException();
	d1.display();
	d2.display2();
	System.out.println("MAIN ENDED");
}

}