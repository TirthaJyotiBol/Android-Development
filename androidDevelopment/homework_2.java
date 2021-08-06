package androidDevelopment;


	//abstract class is made
	abstract class arae1
	{
	  abstract	double circle( double  r );
	  abstract  int rectangle(int l,int b); 
	  abstract int square(int side);
	}
	
	
	// the above abstract class is extended 
	class extension extends arae1{
		double circle(double r) {return 3.14 *r*r; }
		int rectangle(int l,int b) {return l*b ;}
		int square(int side) {return side*side;}
	}
	
	
	public class homework_2 {
	
	public static void main(String[]args)
	{
		//object of extended class is made
		extension h = new extension();
		
		System.out.println("Area of circle is : "+ h.circle(1.32));
		System.out.println("Area of rectangle is : "+h.rectangle(4,3));
		System.out.println("Area of square is : "+h.square(6));
		
	}

}
