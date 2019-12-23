package demo;

public class Demo1 {

		int i;
		int num = 10;
		public void display() {
			int j=20;
			if(num == 10) {
				System.out.println((i=num)-j);
			}
			
		}
		public static void main(String[] args) {
			Demo1 d = new Demo1();
			d.display();
		}

}

