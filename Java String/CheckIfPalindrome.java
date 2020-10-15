/*
 *  This program checks if a string given by the user is a palindrome or not.
 */

import javax.swing.JOptionPane;

public class CheckIfPalindrome {

	public static void main(String[] args) {
		
		boolean keepGoing = true;

		while(keepGoing){
			/*
				JOptionPane.showInputDialog(); method shows a question-message pop up dialog requesting input from the user
				and assign it to a string variable (the variable here is called user_string)

				.toLowerCase() method converts the input to lower case
			*/
			String user_string = JOptionPane.showInputDialog("Enter a string to determine if it is a palindrome\n").toLowerCase();

			char[] theWord= new char[user_string.length()];

			int i;
			for(i=0; i<user_string.length(); i++){
				theWord[i] = user_string.charAt(i);	// Takes every character of the user_string and assign them to a char table
													// that has the exact same length as the user_string
			}
			
			char[] theWordReversed = new char[user_string.length()];
			for( int j=0; j<user_string.length(); j++){
				theWordReversed[j] = theWord[i-1];	// Makes a copy of the char table but the characters are in reversed order
				i--;
			}

			int palindromeLetters = 0; // Counts the amount of characters that are compared and are identical

			for( int j=0; j<user_string.length(); j++){
				if(theWord[j]==theWordReversed[j]){	// The two char tables are compared and for every identical
													// character the palindromeLetters counter increasing by 1
					palindromeLetters++;
				}
			}

			//	JOptionPane.showMessageDialog() method brings up a pop up information-message dialog that contains a message for the user.
			if(palindromeLetters==user_string.length()){
				JOptionPane.showMessageDialog(null,"The word : "+user_string+"\n is a palindrome!");
			}
			else{
				JOptionPane.showMessageDialog(null,"The word : "+user_string+"\n is NOT a palindrome!");
			}

			/*
			 Prompts the user to choose if he wants to continue or exit making sure that the only acceptable inputs
			 are numbers 1 or 2
			*/
			do {
				String answer = JOptionPane.showInputDialog("Continue?\nType 1 to continue\nType 2 to exit");
				if (answer.equals("1")) {
					break;
				}
				else if(answer.equals("2")){
					keepGoing = false;
					break;
				}
				else{
					JOptionPane.showMessageDialog(null,"Wrong input. Please try again!");
				}
			}while(true);
		}
	}
}
