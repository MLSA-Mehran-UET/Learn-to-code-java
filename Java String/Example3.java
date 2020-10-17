public class Example3 {
  public static void main(String[] args) {

    // create string using the new keyword
    String example = new String("Hello! World");

    // returns the substring World
    System.out.println("Using the subString(): " + example.substring(7));

    // replaces the character '!' with 'o'
    System.out.println("Using the replace(): " + example.replace('!', 'o'));
  }
}
