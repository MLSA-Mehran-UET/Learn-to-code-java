import java.util.Scanner;
public class TrianglePatterns {
	public static void main(String[]args)
	{
		int rows;
		System.out.print("Enter Number of rows: ");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		//pattern1
		for(int i=1;i<=rows;i++) {
			System.out.print("\n");
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		}
		//patern2
		System.out.print("\n");
	
		for(int i=1;i<=rows;i++) {
			System.out.print("\n");
			for(int j=1;j<=(rows-i)+1;j++) {
				System.out.print("*");
			}
		}
		//patern3
		
		System.out.print("\n");
		
		for(int i=1;i<=rows;i++) {
			System.out.print("\n");
			//inner loop for spaces
			for(int s=1;s<=rows-i;s++) {
				System.out.print(" ");	
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
		}
		//pattern4
		
		System.out.print("\n\n");
		
		for(int i=1;i<=rows;i++) {
			//inner loop for spaces
			for(int s=2; s<=i ;s++) {
				System.out.print(" ");	
			}
			
			for(int j=1; j<=(rows-i)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//pattern5
		for(int i=65;i<=rows+64;i++){
			for(int s=1;s<=(rows+64)-i;s++){
				System.out.print(" ");
			}
			for(char j=65;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}//end of main
}
