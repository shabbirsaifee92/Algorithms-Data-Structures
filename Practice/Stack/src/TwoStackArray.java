
public class TwoStackArray {

	int[] stack;
	int top1,top2;
	public static void main(String[] args) {
		
	}
	
	void push1(int n){
		
		if(top2-top1>1){
			top1 = top1+1;
			stack[top1]=n;
		}
		else{
			System.out.println("Stack is full");
		}
	}
	
	void push2(int n){
		
		if(top2-top1>1){
			top2 = top2-1;
			stack[top2]=n;
		}
		else{
			System.out.println("Stack is full");
		}
	}
	
	int pop1(){
		if(top1>=0){
			int x = stack[top1];
			top1--;
			return x;
			
		}else{
			System.out.println("Stack is already empty");
		System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
		if(top2<stack.length){
			int x = stack[top2];
			top1++;
			return x;
			
		}else{
			System.out.println("Stack is already empty");
			System.exit(1); 
		}
		return 0;
	}
	
	
}
