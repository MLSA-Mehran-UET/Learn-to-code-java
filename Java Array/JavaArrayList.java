import java.util.*;
public class JavaArrayList {

	public static void main(String[] args) {
		//Default constructor creates an ArrayList of size of 10
		ArrayList names = new ArrayList();
		
		//To add an element in the list, use add() method
		names.add("John"); //add() appends the element in the list, hence John is the last element.
		names.add("Andrew"); //Now Andrew is the last element and John comes before it.
		names.add("Bob"); 
		
		//Printing elements on console
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i)); //get() method is used to retrieve element at sepcified index
		}
		
		//You can assign these values to variables also
	//	String name = names.get(1); //This is an error, because ArrayList stores objects, and hence you have to cast the element to String
		String name = (String) names.get(1); //OK
		System.out.println("Element at 2nd index is: "+name);
		
		//You can add element at specified index by the following add() method
		names.add(1, "Tania"); //Now Andrew and Bob are shifted, i.e their indices are increased by 1
		System.out.println("Element at index 1 is: "+names.get(1)+", and at index 2 is: "+names.get(2)); //Tania, Andrew
		
		//You can also remove element at specified index
		names.remove(0); //This causes other elements to be shifted by 1 index less
		for(Object n: names) { //Object is used because ArrayList only stores Objects
			System.out.println((String)n); //Tania, Andrew, Bob
		}
	}

}
