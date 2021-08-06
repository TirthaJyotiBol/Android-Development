package androidDevelopment;

public class infiniteLoop {
	public static void main(String[]args)
	{
		
		System.out.println("Infinite Loop Using while loop");
		int i=1;
		while(i>0) {System.out.println(i);}         
		
		
		System.out.println("Infinite loop using for loop");
		for(int j=3;j>0;j++) {System.out.println(j);}
		
		
		System.out.println("Infinite loop using do while loop");
		int p=0;
		do {
			System.out.println("yes");
			p++;
		}
		while(p>0);
		
	}

}
