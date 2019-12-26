package Demo3;

abstract class Example {

	public abstract void makenoise();
	public abstract void eat();
	public void sleep()
	{
		System.out.println("The animal is sleeping");
	}
	public abstract void roam();
}
	abstract class Feline extends Example{
		  public void roam() {
			  System.out.println("Felines roam slowly");
		  }
		  }
	
	class Lion extends Feline{
		public void eat() {
			System.out.println("Lions eat meat");
		}
		
		public void makenoise() {
			System.out.println("Lions roar");
		}
	}
	
	public class Animalnew{
		public static void main(String[] args) {
			Example k = new Lion();
			k.eat();
			k.roam();
			k.sleep();
			k.makenoise();
		}
			
			
}
