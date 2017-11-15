import java.util.LinkedList;
import java.util.Stack;

public class SortStack {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		int a[] = {11, 2, 32, 3, 41};
		for(int i =a.length-1;i>=0;i--){
			s.push(a[i]);
		}
		 
		Stack<Integer> res = sortStack(s);
		while(!res.isEmpty()){
			System.out.println(res.pop());
		}
		
	}

	private static Stack<Integer> sortStack(Stack<Integer> s) {
		
		Stack<Integer> helper = new Stack<>();
		int cur = 0;
		helper.push(s.pop());
		while(!s.isEmpty()){
			cur = s.pop();
			if(cur>helper.peek()){
				helper.push(cur);
			}else{
				while(!helper.isEmpty()&&cur<helper.peek()){
					s.push(helper.pop());
				}
				helper.push(cur);
			}
			
		}
		return helper;
	}
}
