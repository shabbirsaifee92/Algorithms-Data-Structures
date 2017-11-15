import java.util.Scanner;

/*
 * Given an array of size n-1 and given that there are numbers from 1 to n with one missing, the missing number is to be found.
 */
public class MissingNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		int arr[] = new int[n];
		int x1=0;
		int x2=0;
		for (int i =0;i<n;i++){
			arr[i] = sc.nextInt();
			x1=x1^arr[i];
		}
		
		for(int i = 1;i<=n+1;i++){
			x2=x2^i;
		}
		
		int missingNo = x1^x2;
		System.out.println("Missing number : "+ missingNo);
		
	}
}
