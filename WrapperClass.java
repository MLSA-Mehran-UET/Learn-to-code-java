/*
    Java is not 100% OOP because it can have primitive type variables like int float etc
    but wrappper class gives a solution. instead of creating primitive variables. we can store our
data into wrapper classes. 
for eg 
Integer is a wrapper class which stores int values . But since Integer is a class not primitive variabele
hence we can say that now every things is object
*/
package wrapper.pkgclass;


public class WrapperClass {

    public static void main(String[] args) {
        // static function present in each wraper class
        // takes input as integer and saves as integer 
        // return reference of Integer class
        Integer in= Integer.valueOf("88");
        //similary
        Float f=Float.valueOf("5.55");
        
        //static funtion to convert string to corresponding types
        int i=Integer.parseInt("22");
        //similarly
        double d=Double.parseDouble("4.3");
        
        //instance function that returns value stored in Integer class
        int a =in.intValue();
    }
    
}
class Wrapperclass
{
	public static void main(String args[])
	{
		// static function present in each wraper class
	   String a="123";
	   Integer i=Integer.parseInt(a);     //creating a wrapper class object
	                                      //this will convert the string into the corresponding type

	   if(a.equals("123"))
	   {
	       System.out.println("Equals");
	   }
	   else
	   {
	      System.out.println("Not equals");
	   }

	   if(i==(123))
	   {
	   	  System.out.println("Print");
	   }
	   else
	   {
	   	  System.out.println("Not Print");
	   }
	}
}
