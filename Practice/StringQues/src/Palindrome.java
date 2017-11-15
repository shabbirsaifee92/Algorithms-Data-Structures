
/*
 * Check if string is palindrome without apis
 */
public class Palindrome {
	public static void main(String[] args) {
		String s ="ARORA";
		boolean b = isPalindromeRecur(s);
		System.out.println(b);
	}
	
	
	static boolean isPalindrome(String s) {
		
		int start = 0;
		int end = s.length()-1;
		while(start<end){
			if(s.charAt(start)==s.charAt(end)){
				start++;;
				end--;
			}
			else{
				return false;
			}
		}
		
		return true;
	}
	
	static boolean isPalindromeRecur(String s ){
		// Base
		int start =0;
		int end = s.length()-1;
		if(start==end){
			return true;
		}
		while(start<end){
			if(s.charAt(start)==s.charAt(end)){
				String s1= s.substring(start+1, end);
				return isPalindromeRecur(s1);
				
			}
			else{
				return false;
			}
		}
		return false;
		
	}
}
