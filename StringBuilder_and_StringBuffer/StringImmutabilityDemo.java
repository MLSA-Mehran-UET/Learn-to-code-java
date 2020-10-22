package StringBuilder_and_StringBuffer;

//this program can be used to understand the concept of immutability among string objects
public class StringImmutabilityDemo {
    public static void main(String[] args) {
        
        String test = new String("String #1 ");   //creating string object
        //it will create two string objects with same value 
        // one will be in STRING CONSTANT POOL 
        // other in HEAP AREA
        System.out.println(test.hashCode());

        // REFER HERE for details ----------- https://www.journaldev.com/797/what-is-java-string-pool

        //let us assign the reference of test string to some other replica string as follows:::

        String testReplica = test; 
        System.out.println(testReplica.hashCode());

        //now if we modify testReplica ,will it modify test also? 
        testReplica += " changed ";
        System.out.println(testReplica.hashCode()); // hash will change as new object will be made

        //also modifying testReplica doesnt modify test string at all 

        System.out.println(test);

        //to check what happened behind the scenes

        System.out.println(test == testReplica); // gives false because both objects now refer to different locations as when we modify the strings
                                                //due to immutability new strings are made rather than modifying previous one

        //so we are not actually modifying the actual strings but instead a new string is made when we make any changes to original one
        //this showss that string are immutable and you cannot change their state by modifying them 
    }    
}



