import java.util.Scanner;

public class Leapyear {

	public void year() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int n = sc.nextInt();
		if ((n%4==0) || (n%100==0) && (n%400 ==0)) {
			System.out.println("Is a leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}
	public static void main(String[] args) {
		Leapyear n = new Leapyear();
		n.year();
	}
}
