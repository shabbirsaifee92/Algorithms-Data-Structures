import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class StringHasPalindrome {

	public static void main(String[] args) {
		String s = "12xyyx";
		Stack<Character> st = new Stack<>();
		
		for( int i=0;i<s.length();i++){
			st.push(s.charAt(i));
		}
		
		while(!st.isEmpty()){
			String s1=String.valueOf(st.pop())+String.valueOf(st.pop());
			if(s.contains(s1)){
				System.out.println("true");
			}
			
		}
		
	}
}
