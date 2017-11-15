import java.util.Stack;

/*
 * Given a string consisting of opening and closing parenthesis, find length of the longest valid parenthesis substring.
 */
public class ValidString {

	public static void main(String[] args) {
		
		String s = "))()())";
		int maxLegnth = calLength(s);
		System.out.println(maxLegnth);
	}

	private static int calLength(String s) {
		
		int l = s.length();
		Stack<Character> st = new Stack<>();
		int count = 0;
		
		for(int i =0;i<l;i++){
			char c = s.charAt(i);
			if(c=='(')
				{
				st.push(c);
				}
			else if(c==')'){
				if(!st.isEmpty()&&st.peek()=='('){
					st.pop();
					count+=2;
				}else{
					st.push(c);
				}
			}
			
			
			}
		return count;
	}
}
