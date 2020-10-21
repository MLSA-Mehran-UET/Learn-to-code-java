package StringBuilder_and_StringBuffer;

import java.lang.StringBuilder;

/*  HIERARCHY 

        java.lang.Object
                ↳ java.lang
                    ↳ Class StringBuilder
*/

public class StringBuilderDemo {

    public static void main(String[] args) {
        

        StringBuilder builderObj = new StringBuilder(); //creates an empty stringbuilder object with initial capacity of 16chars
        builderObj.append("We are demonstrating string builder in java \n ");
        builderObj.append(5); // we can append even the integers as we do in Strings 
                            // we can also append floats ,doubles etc

        StringBuilder builderObj2 = new StringBuilder("I shall be appended to buiderObj \n ");

        builderObj.append(builderObj2); // append one object to other 

        //we can convert stringbuilder to strings
        //by following ways 

        String generateStrFromBuilder = builderObj.toString();
        //or 
        String generateStrFromBuilder2 = new String(builderObj);

        builderObj.charAt(2);
        builderObj.append(new char[] {'\n', 'l', 'a' , 's','t', 'a','p','p','e','n','d'}); //appending char array to builder objects

        System.out.println(builderObj.substring(0 ,((builderObj.length()-1)/2 )));  // retrieve fist half of builder string
        
        builderObj.setLength(5); // this sets length of obj created above and chops off any characters beyond that length

        System.out.println(builderObj);

        StringBuilder reversed = builderObj.reverse(); // reverses the contents and returns new builder obj

        builderObj.setCharAt(0, '?'); // replace char at 0 with ?

        
    }

}

/* 
 There are other methods also related to StringBuffer which you can checkout 

 Reference - www.geeksforgeeks.org
*/