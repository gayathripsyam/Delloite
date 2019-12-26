package Demo3;

abstract class Animal {
	 
	public abstract void eat();
	public void sleep() {
		System.out.println("The animal sleeps");
	}
}
	class Dog extends Animal{
		
		@Override 
		public void eat() {
			System.out.println("Dog eats meat");
		}
	}
	class Cat extends Animal{
		
		@Override
		public void eat() {
			System.out.println("cat drinks milk");
		}
	}



