/*
 *  Given an array sort it in zig-zag fasion i.e a<b>c<d>e
 */
public class ZigZagArray {

	public static void main(String[] args) {
		
		int arr[] = {4,3,7,8,6,2,1};
		for(int i =0;i<arr.length-2;i++){
			
			if(i%2==0){	// condition for a(i)<a(i++)
				if(arr[i]>arr[i+1])
					swap(arr,i,i+1);
				
			}else{ // condtion for a(i)>a(i++)
				if(arr[i]<arr[i+1])
					swap(arr,i,i+1);
			}
		}
		for(int i : arr){
			System.out.print(i+" ");
		}
	}

	private static void swap(int[] arr, int i, int j) {
		
		arr[i] = arr[i]+arr[j];
		arr[j] = arr[i]-arr[j];
		arr[i] = arr[i]-arr[j];
		
	}
}
