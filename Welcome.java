import Finance.*;

public class Welcome {
	public static void main(String[] args) {
	System.out.println("Welcome");
	Bye b = new Bye();
	b.sayThanks();
	Profile p = new Profile();
	p.login();
	Exam e = new Exam();
	e.results();
	Salary s = new Salary();
	int result = s.calculateSalary(2000,89000);
	System.out.println(result);
	}
}
