import java.util.Scanner;

/*
 *Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that 
 *prod[i] is equal to the product of all the elements of arr[] except arr[i]. Solve it without division operator and in O(n).
 *Example:
 *arr[] = {10, 3, 5, 6, 2}
 *prod[] = {180, 600, 360, 300, 900} 
 */


public class ProdArrayPuzzle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter the lements of the array");
		for(int i =0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int prod[]=calProd(n,arr);
		for(int i =0;i<n;i++){
			System.out.print(prod[i]+" ");
		}
	}

	private static int[] calProd(int n, int[] arr) {
		int prod[] = new int[n];
		int forw[] = new int[n];
		int rev[] = new int[n];
		forw[0] = 1;
		rev[n-1]=1;
		for(int i=1;i<n;i++){
			forw[i] = arr[i-1]*forw[i-1];
		}
		prod[n-1]=forw[n-1];
		for(int i =n-2;i>=0;i--){
			rev[i]=arr[i+1]*rev[i+1];
			prod[i]=forw[i]*rev[i];
		}
		
		
		return prod;
	}
}
