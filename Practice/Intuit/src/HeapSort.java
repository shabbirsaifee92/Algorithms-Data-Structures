

public class HeapSort {

	public static void main(String[] args) {
		
		int arr[] = {4,1,3,9,7};
		int n = arr.length;
		for(int i = n/2-1 ;i>=0;i--){
		maxHeapify(arr,n,i);	
		}
		
		for(int  i =0;i<n;i++){
			System.out.println(arr[i]);
		}
		
	}

	private static void maxHeapify(int[] arr, int n, int i) {
		
		int left = 2*i+1;
		int right = 2*i+2;
		int largest = i;
		
		if(left<n && arr[left]>arr[largest]){
			largest = left;
		}
		
		if(right<n && arr[right]>arr[largest]){
			largest = right;
		}
		
		if (largest !=i){
			int temp = arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			maxHeapify(arr, n, largest);
		}
		
	}
}
