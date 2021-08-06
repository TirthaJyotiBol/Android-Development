package androidDevelopment;

//first abstract class is made 
abstract class animal1
{
	abstract void cat();
	abstract void dog();
}


//second abstract class is made
abstract class person
{
	abstract void eat();
	abstract void sleep();
}


//first abstract class is called for one

class a extends animal1
{
	void cat() {System.out.println("Cat 1");}
	void dog() {System.out.println("Dog 1");}
}


//again first is called 
class b extends animal1{
	void cat() {System.out.println("cat 2");}
	void dog() {System.out.println("Dog 2");} 
}


// second abstract class is called 
class man1 extends person{
	void eat() {System.out.println("man 1 is eating ");}
	void sleep() {System.out.println("man 1 is sleeping");}
}

public class abstraction {
	
	public static void main(String[]args) {
		 a one = new a();
		 one.cat();
		 one.dog();
		 
		 b two = new b();
		 two.cat();
		 two.dog();
		 
		 man1 man = new man1();
		 man.eat();
		 man.sleep();
		 
	}

}
