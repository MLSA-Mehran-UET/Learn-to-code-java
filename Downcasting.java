
// Downcasting is when a child class type reference variable point to/references 
// to a parent object or parentclass type
package downcasting;

class Animal
{

}  
public class Downcasting extends Animal{
   
    
    static void method(Animal a) {  
    if(a instanceof Downcasting){  
       Downcasting d=(Downcasting)a;//downcasting  
       System.out.println("ok downcasting performed");  
    }  
    }

    public static void main(String[] args) {

    //downcasting is not possible in this way will give compile-time error          
    // Downcasting d=new Animal();
    
    //Compiles successfully but ClassCastException is thrown at runtime if we use type casting as shown under :  
    // Dog d=(Dog)new Animal();
    
    //but we can do it as under
        Animal a=new Downcasting();  
        Downcasting.method(a);  

    }
    
}
