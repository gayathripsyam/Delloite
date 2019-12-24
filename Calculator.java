package Exercise;

public class Calculator {
	
		public void add(int a, int b) {
		System.out.println(a+b);
		}
		public void add(double a, double b) {
			System.out.println(a+b);
		}
		public void add(int a, double b) {
			double s = a;
			System.out.println(s+b);
		}
		public void add(double a, int b) {
			double s = (double) b;
			System.out.println(a+s);
		}
	


	public void subtract(int a, int b) {
		System.out.println(a-b);
	}
	public void subtract(double a, double b) {
		System.out.println(a-b);
	}
	public void subtract(int a, double b) {
		double s = a;
		System.out.println(s-b);
	}
	public void subtract(double a, int b) {
		double s = (double) b;
		System.out.println(a-s);
	}




	public void div(int a, int b) {
		System.out.println(a/b);
	}
	public void div(double a, double b) {
		System.out.println(a/b);
	}
	public void div(int a, double b) {
		double s = a;
		System.out.println(s/b);
	}
	public void div(double a, int b) {
		double s = (double) b;
		System.out.println(a/s);
	}




	public void mul(int a, int b) {
		System.out.println(a*b);
	}
	public void mul(double a, double b) {
		System.out.println(a*b);
	}
	public void mul(int a, double b) {
		double s = a;
		System.out.println(s*b);
	}
	public void mul(double a, int b) {
		double s = (double) b;
		System.out.println(a/s);
	}
		
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		c.add(4,5);
		c.subtract(3.4, 1.7);
		c.mul(4, 4);
		c.div(3, 9);

	
	}

}