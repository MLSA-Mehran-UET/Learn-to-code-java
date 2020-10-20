class InvalidPriceException extends Exception{  
 InvalidPriceException(String s){  
  super(s);  
 }
}
class TestCustomException1{  
static void validate(int price)throws InvalidPriceException{  
if(price<0)  
throw new InvalidPriceException(price+" is Invalid Price");  
else  
System.out.println(price +" is valid price");  
}  
public static void main(String args[]){  
try{  
validate(-2);  }
catch(Exception m){System.out.println("Exception occured: "+m);}  
}  
}
