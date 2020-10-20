
//every catch block will be checked exception is same that catch will be execuate if it do not match with any catch block in //that case last Exception  catch will be executed

public class MultipleCatch {  
  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[5];    
                a[5]=30/0;    
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  
} 

class MultipleCatch
{
	public static void main(String args[])
	{
	   int []num1,num2;

	   try
	   {
	      num1=new int[5];
	      System.out.println(num1[5]);
	   }
	  catch(NullPointerException a)
	   {
	     System.out.println("zero");
	   }

	   catch(Exception b)
	   {
	    System.out.println("Bound to index");
	   }


	    System.out.println("Out off catch");
	}
}
