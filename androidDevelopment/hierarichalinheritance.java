package androidDevelopment;

	class Animal{
		void eat() {
			System.out.println("eating...");
		}
	}
	
	class dog extends Animal{
		void bark() {
			System.out.println("barking..");
		}
	}
	
	class cat extends dog{
		void mew() {
			System.out.println("meoww...");
		}
	}
	
	public class hierarichalinheritance {
	
	public static void main(String[]args) {
		cat c = new cat();
		c.mew();
		c.eat();
		c.bark();
		
		dog d = new dog();
		d.bark();
		d.eat();
		
		
	}
	
}
