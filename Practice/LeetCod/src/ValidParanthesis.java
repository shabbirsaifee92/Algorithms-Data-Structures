import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String args[]){
		String s ="[()]()]";
		String s2="[(])";
		
		boolean b = isValid(s);
		System.out.println(b);
	}

	private static boolean isValid(String s) {
		
		LinkedList<Character> stack = new LinkedList<Character>();
		char prev=s.charAt(0);
		stack.push(prev);
		for(int i =1;i<s.length();i++){
			char c =s.charAt(i);
			if(c==')'&&prev=='('){
				stack.pop();
				
			}else if(c==']'&&prev=='['){
				stack.pop();
			}
			else if(c=='}'&&prev=='{'){
				stack.pop();
			}
			else{
			stack.push(c);	
			}
			if(!stack.isEmpty())
			{
				prev=stack.peek();
			}
			else{
				prev='$';
			}
		}
		
		if(stack.isEmpty()){
			return true;
		}
		return false;
	}
}
