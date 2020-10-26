import java.util.Scanner;

class ScientificCalculator
{
	 public static void main(String args[])
	 {


	   Scanner x=new Scanner(System.in);
	   System.out.println("**********THE CALCULATOR**********");
	   System.out.println("1.Add \n2.Subtract \n3.Multiply \n4.Division \n5.sineLaw \n6.cosineLaw \n7.tangentLaw \n8.Square \n9.SquareRoot");
	   

	   

	   int a,b;
	   double c;

	   int i=x.nextInt();

	   switch(i)
	   {
	     case 1:

	     System.out.println("Enter the Number");
	     a=x.nextInt();
         System.out.println("Enter the Number");
         b=x.nextInt();
         System.out.println("Sum="+(a+b));
         break;

         case 2:
         System.out.println("Enter the Number");
	     a=x.nextInt();
         System.out.println("Enter the Number");
         b=x.nextInt();
         System.out.println("Subtract="+(a-b));
         break;

         case 3:
         System.out.println("Enter the Number");
	     a=x.nextInt();
         System.out.println("Enter the Number");
         b=x.nextInt();
         System.out.println("Multiply="+(a*b));
         break;
        
         case 4:
         System.out.println("Enter the Number");
	     a=x.nextInt();
         System.out.println("Enter the Number");
         b=x.nextInt();
         System.out.println("Division="+(a/b));
         break;

         case 5:

         System.out.println("Enter the Number");
         c=x.nextDouble();

         c=Math.toRadians(c);
         System.out.println("Sine Value="+(Math.sin(c)));
         break;

         case 6:
         System.out.println("Enter the Number");
         c=x.nextDouble();

         c=Math.toRadians(c);
         System.out.println("Cosine Value="+(Math.cos(c)));
         break;

         case 7:
         System.out.println("Enter the Number");
         c=x.nextDouble();

         c=Math.toRadians(c);
         System.out.println("tangent Value="+(Math.tan(c)));
         break;

         case 8:
         System.out.println("Enter the Number");
         a=x.nextInt();

         System.out.println("Square="+(Math.sqrt(a)));
         break;

         case 9:
         System.out.println("Enter the  Number");
         a=x.nextInt();

         System.out.println("Square Root="+(Math.pow(a,2)));
         break;

         default:
         System.out.println("No Match");
         



	   }


	 }
}
