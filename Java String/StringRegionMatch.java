
public class StringRegionMatch {
	//This program illustrates regionMatch() method that can be used to search a string or part of 
	// string in another string

	public static void main(String[] args) {
		System.out.println("home matches 'Hello! Anyone home!?':"+regionMatch("home", "Hello! Anyone home!?")); // true
		System.out.println("om matches my-home:"+regionMatch("om", "my-home")); // true
		System.out.println("ht matches height:"+regionMatch("HT", "height")); // true
	}
	
	public static boolean regionMatch(String match, String target) {
		String matchCopy = match.toLowerCase();
		String targetCopy = target.toLowerCase();
		/* Since strings are objects and they are assigned by reference, so their copies are made.
		 * Both are to lower case so that case-sensitivity can be removed
		 * Hence, regionMatch match function is not case sensitive.
		 * Therefore regionMatch("ht", "HEIGHT") returns true value. 
		 */
		String temp = "";
		for(int m=0; m<targetCopy.length(); m++) {
			for(int n=0; n<matchCopy.length(); n++) {
				if(targetCopy.charAt(m+n)!=matchCopy.charAt(n)) {
					break;
				}
				else {
					temp += targetCopy.charAt(m+n);
				}
				
				if(temp.equals(matchCopy)) {
					return true;
				}
			}
			temp = ""; //For removing previous partially matched string characters, as in case of height; first h is matched but i isn't with e.
		}
		return false;
	}

}
