package androidDevelopment;


class oneDarray{
	void print1(){System.out.println("One Dimensional Array -> Parent");}
}

class twoDarray extends oneDarray {
	void print2() {System.out.println("Two Dimensional Array -> Child ");}
}

class threeDarray extends twoDarray{
	void print3() {System.out.println("Three Dimensional Array -> Grand Child");}
}


public class inheritanceHomework {
	
	public static void main(String[]args) {
		
		//first created
		System.out.println("First ->");
		oneDarray od = new oneDarray();
		od.print1();
	
		
		//second object created
		System.out.println("Second ->");	
		twoDarray td = new twoDarray();
		td.print1();
		td.print2();

		
		
		//third
		System.out.println("Third ->");
		threeDarray tda = new threeDarray();
		tda.print1();
		tda.print2();
		tda.print3();
	}

}
