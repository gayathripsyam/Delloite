import java.util.*;

public class NumberSwap {
		public void Swap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
	
		int a = n1;
		n1 = n2;
		n2 = a;
		
		System.out.println("First number after swap : " + n1 + "Second number after swap : " + n2);
	}
public static void main(String[] args) {
	NumberSwap n = new NumberSwap();
	n.Swap();
}}