import java.util.Scanner;

/*
 * Q: Sort a binary array in non decreasing order
 */
public class SortBinaryArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of array");
		int sum =0;
		for(int i =0;i<n;i++){
			
			sum+=sc.nextInt();
			
		}
		
		for(int i =n-1;i>=0;i--){
			if(sum>0){
				arr[i]=1;
				sum--;
			}
			else{
				break;
			}
		}
		
		for(int i =0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	private static int[] sortBinaryArray(int[] a,int n){
		 int j=-1;
		for(int i=0;i<n;i++){
			if(a[i]<1){
				j++;
				int t = a[i];
				a[i] = a[j];
				a[j]=t;
			}
		}
		
		return a;
	}
}
