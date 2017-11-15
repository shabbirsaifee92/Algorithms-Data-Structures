
public class Fibonacci {

	public static void main(String args[]){
		int n =10;
		printFibonacci(n);
		
	}

	private static void printFibonacci(int n) {
		int f0=0;
		int f1=1;
		int fib=0;
		
		if(n==0){
			System.out.println(f0);
			return;
		}
			
		else if(n==1){
			System.out.println(f1);
			return ;
		}
		else {
			for( int i = 2;i<=n;i++){
				fib =f0+f1;
				System.out.println(fib);
				
				f0=f1;
				f1=fib;
				
			}
		}
			
		
	}
}
