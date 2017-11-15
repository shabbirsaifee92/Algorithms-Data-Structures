import java.util.Scanner;

/*
 * Given an unsorted array of size N. 
 * Find the first element in array such that all of its left elements are smaller and all right elements to it are greater than it.
 */
public class FirstPivotElement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = sc.nextInt();
		int arr [] = new int[n];
		System.out.println("Enter all the elements of an array");
		
		for(int i =0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int pivot = findFirstPivot2(arr,n);
		System.out.println(pivot);
	}

	private static int findFirstPivot2(int [] a , int n)
	{
		
		int leftMax[] = new int[n];
		int rightMin[] = new int[n];
		int max=a[0];
		int min = a[n-1];
		// calculate max
		for(int i =1;i<n;i++){
			if(a[i]>max){
				leftMax[i]=a[i];
				max=a[i];
			}else{
				leftMax[i]=leftMax[i-1];
			}
			
		}
		// calculate min
		for(int i =n-2;i>=0;i--){
			if(a[i]<min){
			rightMin[i]=a[i];
				min=a[i];
			}else{
				rightMin[i]=rightMin[i+1];
			}
			
		}
		
		//get the pivot
		for(int i=0;i<n;i++){
			if(a[i]==leftMax[i] && a[i]== rightMin[i])
				return a[i];
		}
		
		
		
		
		return -1;
	}
	private static int findFirstPivot(int[] arr,int n) {
		
		int leftMax[] = new int [arr.length];
		int rightMin[] = new int [arr.length];
		leftMax[0] = arr[0];
		rightMin[n-1]=arr[n-1];
		
		for(int i =1;i<n;i++){
			
			if(arr[i]>leftMax[i-1]){
				leftMax[i]=arr[i];
			}
			else{
				leftMax[i]=leftMax[i-1];
			}
		}
		
		
		for(int i =n-2;i>=0;i--){
			
			if(arr[i]<rightMin[i+1]){
				rightMin[i]=arr[i];
			}
			else{
				rightMin[i]=rightMin[i+1];
			}
				
		}
			
		
		for(int i =0;i<n;i++){
			if(arr[i]==leftMax[i] && arr[i]==rightMin[i])
				return arr[i]	;		
		}
		
		return -1;
	}

}
