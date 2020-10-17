public class JavaStringExample {

    public static void main(String args[]) {
        // Defining a String Object
        String sampleString =  "Hello World";

        System.out.println("Sample String : " + sampleString);

        // Convert all the characters in the String to lower case
        String lowerCaseString = sampleString.toLowerCase();
        System.out.println("String in Lower case is " + lowerCaseString);

        // Find the number of characters
        int stringLength = sampleString.length();
        System.out.println("Length of the String is " + stringLength);

        // Finds a character in the String at particular index.
        // Note the first character is at index 0.
        int position = 4;
        char charInString = sampleString.charAt(position);
        System.out.println("Char at position " + position + " is " + charInString);

        // String Concatenation which joins a new String to the end of the given String.
        String anotherString = " Happy Coding";
        String concatenatedString = sampleString.concat(anotherString);
        System.out.println("Concatenated with " + anotherString + " results in " + concatenatedString);

        // Finds a Substring in the given String
        // Start Index is the index of first character to be included in Substring
        // Substring ends at index equal to (endIndex-1)
        int startIndex = 0, endIndex = 4;
        String subString = sampleString.substring(startIndex, endIndex);
        System.out.println("SubString from "+ startIndex + " to " + endIndex + " is " + subString);
    }
}