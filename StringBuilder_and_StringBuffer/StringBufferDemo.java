package StringBuilder_and_StringBuffer;

import java.lang.StringBuffer;
/* 

    StringBuffer is a peer class of String that provides much of the functionality of strings.
    String represents fixed-length, immutable character sequences while StringBuffer represents growable and writable character sequences.

    StringBuffer may have characters and substrings inserted in the middle or appended to the end.
    It will automatically grow to make room for such additions and often has more characters preallocated than are actually needed,
    to allow room for growth.

*/

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new  StringBuffer("HacktoberFest 2020");

        int length = stringBuffer.length(); //length means occupied space

        int capacity = stringBuffer.capacity(); // capacity means total available space 

        stringBuffer.append(" \n is held in October to emphasize OpenSource world");
        //we can append integers, floats doubles etc also to the StringBuffer objects

        stringBuffer.setCharAt(0, 'h'); //set particular character at  a position

        stringBuffer.replace(0, ((stringBuffer.length()-1)/2), "half string replaced"); // replace s sequence of char between two indices with other string

        boolean result = stringBuffer.equals(new StringBuffer("testBuffer"));

        String substr = stringBuffer.substring(0, 4); // retrieve substring from a specified index range

    }

}

/* 
 There are other methods also related to StringBuffer which you can checkout 

 Reference - www.geeksforgeeks.org
*/
