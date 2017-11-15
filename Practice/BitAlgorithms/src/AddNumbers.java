import java.util.Scanner;

//Add two numbers without using arithmetic operators

public class AddNumbers {

	public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter first number");
		int x = sc.nextInt();
		System.out.println("Enter second number");
		int y = sc.nextInt();
		
		int sum = add(x,y);
		System.out.println("Sum of numbers: "+sum);
	}

	private static int add(int x, int y) {
		
		while(y!=0){
			
			int carry = x&y;
			x = x^y;
			y = carry<<1;
		}
		return x;
	}
	
	
}
