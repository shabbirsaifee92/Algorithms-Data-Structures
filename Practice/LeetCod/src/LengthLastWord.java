/*
 * Q:
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * return the length of last word in the string.
 * If the last word does not exist, return 0.
 */


public class LengthLastWord {

	public static void main(String args[]){
		String s ="a ";
		int length=lengthOfLastWord(s);
		System.out.println(length);
	}

	private static int lengthOfLastWord(String s) {
		if(s.length()==0){
			return 0;
		}
		s=s.trim();
		if(s.length()==0){
			return 0;
		}
		int lastSpace=s.lastIndexOf(' ');

		return s.substring(lastSpace+1,s.length()).length();
	}
}
