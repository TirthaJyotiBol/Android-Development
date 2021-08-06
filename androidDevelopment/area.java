package androidDevelopment;

public class area {
	void circle(double r)
	{
		double area = 3.14*r*r;
		System.out.println("Area of circle is : "+ area);
	}
	
	void rectangle(int l,int b)
	{
		int area = l*b;
		System.out.println("The area of rectangle is : "+ area);
	}
	
	public static void main(String[]args ) 
	{
		area A = new area();
		A.circle(4);
		A.rectangle(2,3);
	}

}
