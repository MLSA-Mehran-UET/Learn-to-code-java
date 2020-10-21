import java.util.Scanner;
class MorePatterns {
    public static void main(String[] args) {
        // *******************
        // For Diamond Pattern
        // *******************
        int n, i, j, space = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Diamond: ");
        n = sc.nextInt();
        space = n - 1;
        for (j = 1; j<= n; j++)
        {
            for(i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for(i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for(j = 1; j<= n - 1; j++)
        {
            for(i = 1; i<= space; i++)
            {
            System.out.print(" ");
            }
            space++;
            for(i = 1; i<= 2 * (n - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        //********************** 
        // For Sandglass Pattern
        //**********************

        System.out.print("Enter the number of rows for Sandglass: ");
        int rows = sc.nextInt();            
        for (int x= 0; x<= rows-1 ; x++)
        {
            for (int y=0; y <x; y++)
            {
                System.out.print(" ");
            }
            for (int z=x; z<=rows-1; z++) 
            { 
                System.out.print("*" + " "); 
            } 
            System.out.println(""); 
        } 
        for (int x= rows-1; x>= 0; x--)
        {
            for (int y=0; y< x ;y++)
            {
                System.out.print(" ");
            }
            for (int z=x; z<=rows-1; z++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }

        //***************************
        // For Number series with sum 
        //***************************
        
        System.out.print("Enter the number of rows for Number series: ");
        int row_no = sc.nextInt();  
        int c = 1;
        for(int a = 0; a < 5; a++)
        {
            int sum = 0;
            for(int b = 0; b < row_no; b++)
            {
                System.out.print(c + " ");
                c++;
                sum += c;
            }
            System.out.print(" = " + sum + "\n");
        }
    }
}