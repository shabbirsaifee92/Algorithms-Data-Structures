/*
 * Given a string of characters consisting of 0 or more spaces, remove all the spaces from this given string. 
 * Separation of spaces from other characters should be done in-place(without using extra space).
 *  Expected time complexity is O(n).
 *  For example, if the input string is "  Hi, How are you?  " then the output returned should be "Hi,Howareyou?"
 */



public class RemoveSpaces {

	public static void main(String args[]){
		StringBuilder s = new StringBuilder("  Hi, Ho w are you?  ");
		RemoveSpaces o = new RemoveSpaces();
		o.delSpaces(s);
	}

	private void delSpaces(StringBuilder s) {
		
		int size = s.length();
		int i =0;
		while(i  < s.length()){
			if(s.charAt(i)==' '){
				s=s.deleteCharAt(i);
			}
			else{
				i++;
			}
		}
		System.out.println(s);
	}
	
	
	
}
