import java.util.Stack;

/*
 * Given an expression with only ‘}’ and ‘{‘. The expression may not be balanced.
 *  Find minimum number of bracket reversals to make the expression balanced.
 */
public class BalanceExpression {

	public static void main(String[] args) {
		String s = "}}}{";
		int min = balanceExpression(s);
		System.out.println(min);
	}

	private static int balanceExpression(String s) {
		// TODO Auto-generated method stub
		Stack<Character> st = new Stack<>();
		int count =0;
		int n = s.length();
		
		for(int i =0;i<n;i++){
			char c = s.charAt(i);
			if(c=='{')
				st.push(c);
				
			else if(c=='}'){
				if(!st.isEmpty() && st.peek()=='{')
					st.pop();
				else{
					st.push(c);
				}
					
			}
			
		}
		
		while(!st.isEmpty()){
			char c = st.pop();
			if(c=='{'){
				if(!st.isEmpty() && st.peek()=='{'){
					count++;
					st.pop();
				}else if(!st.isEmpty() && st.peek()=='}'){
					count+=2;
					st.pop();
				}
				else{
					return -1;
				}
			}else if(c=='}'){
				if(!st.isEmpty() && st.peek()=='}'){
					count++;
					st.pop();
				}
				else{
					return -1;
				}
			}
		}
		return count;
		
	}
}
