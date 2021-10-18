
public class PasswordValidator {
	//A strong password must have numbers, capital letters, special characters and at least total size of 8 characters
	//The validator() method checks whether the password contains all of them or not.
	
	public static void main(String[] args) {
		System.out.println(validate("AbAziz#64")); //true
		System.out.println(validate("MLSA-club")); //false
		System.out.println(validate("1234567")); //false
	}

	public static boolean validate(String password) {
		boolean hasNumber=false, hasCapitalLetter=false, hasSpecialChar=false, hasAppropriateLength=false;
		char[] specialChars = {'!', '@', '#', '$', '%', '&', '*', '_', '`', '~', '^', '(', ')', '-', '+', '=', '{',
							   '}', '[', ']', ';', '"', '/', '.', '<', '>', '?', '\054'}; // \054 is octal ASCII code for comma
		if(password.length()>=8) {
			hasAppropriateLength = true;
		}
		else {
			return false; //This return statement is to skip further checking
		}
		
		for(int j=0; j<password.length(); j++) {
			if(password.charAt(j) >= 65 && password.charAt(j) <= 90) {
				hasCapitalLetter = true;
			}
			
			if(!hasSpecialChar) { //This not operator is to skip further checking
				for(int k=0; k<specialChars.length; k++) {
					if(password.charAt(j)==specialChars[k]) {
						hasSpecialChar = true;
						break;
					}
				}
			}
			
			if(!hasNumber) {
				for(int k=0; k<password.length(); k++) {
					if(password.charAt(k)>=48 && password.charAt(k)<=57) {
						hasNumber = true;
						break;
					}
				}
			}

		}
		
		
		
		return (hasNumber && hasCapitalLetter && hasSpecialChar && hasAppropriateLength);
	}
}
