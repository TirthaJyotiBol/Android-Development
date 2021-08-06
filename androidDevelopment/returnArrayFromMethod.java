package androidDevelopment;
import java.util.*;


public class returnArrayFromMethod {	
	
static int[] returnarray(){
	System.out.println("Enter the size of the array : ");
	Scanner scan = new Scanner(System.in);
	int size=scan.nextInt();
	
	int []a=new int[size];
	System.out.println("Enter the elements - ");
	for(int i=0;i<size;i++) {  a[i]=scan.nextInt();	}
	return a;
}

public static void main(String[]args) {
	
	returnArrayFromMethod ra = new returnArrayFromMethod();
	int []arr=ra.returnarray();
	System.out.println("The returned array is :");
	
	for(int h:arr) { System.out.print(h+" "); }
}
	

}
