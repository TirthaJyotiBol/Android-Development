package androidDevelopment;
import java.util.Scanner;
public class twoDimensionalArray {
	
	public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);	
	System.out.println("Enter the size of rows and columns : ");
	int rows = scan.nextInt();
	int cols = scan.nextInt();
	int arr[][]=new int[rows][cols];
	
	System.out.println("Enter the Elements in the array : ");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			arr[i][j]=scan.nextInt();
		}
	}
	
	System.out.println("the elements are : ");
	for(int i=0;i<rows;i++) {
		for(int j=0;j<cols;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	

}
}
