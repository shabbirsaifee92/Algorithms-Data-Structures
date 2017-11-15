
public class ImplmentStack {

	static class Stack <Node>{
		
		int top;
		int maxSize=10;
		Node arr[];
		
		Stack(){
			arr = (Node[]) new Object[10];
			top =-1;			
		}
		Node pop(){
			if(top==-1){
				return (Node) new Exception();
			}
			Node n = arr[top];
			top --;
			return n;
						
		}
		
		void push(Node n){
			//check size and add
		}
		
		boolean isEmpty(){
			
			return false;
		}
	}
}
