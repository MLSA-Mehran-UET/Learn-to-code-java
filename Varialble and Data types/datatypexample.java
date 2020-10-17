class datatypexample{

public static void main(String arg[]){
byte myNum = 100; //Byte
System.out.println("Byte value is:"+myNum);

short myNumShort = 5000; // Short
System.out.println("Short value is:"+myNumShort);

int myNumInt = 5;               // Integer (whole number)
System.out.println("Integer value is:"+myNumInt);

long myNumLong = 15000000000L; //Long
System.out.println("Long value is:"+myNumLong);

float myFloatNum = 5.99f;    // Floating point number
System.out.println("Float value is :"+myFloatNum);

double myNumDouble = 19.99d; //double
System.out.println("Double value is:"+myNumDouble);

char myLetter = 'D';         // Character
System.out.println("Character is:"+myLetter);

boolean myBool = true;       // Boolean
System.out.println("Boolean value is :"+myBool);

String myText = "Hello";     // String
System.out.println("String is : "+myText);
  
final int myNum1 = 15;
System.out.println("Final Number is : "+myNum1);
myNum1 = 20;  // will generate an error: cannot assign a value to a final variable




}
}
