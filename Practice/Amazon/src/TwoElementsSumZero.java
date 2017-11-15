import java.util.Arrays;

/*
 * find two elements in array whose sum is closest to zero
 */
public class TwoElementsSumZero {

	public static void main(String[] args) {
		int arr [] = {1,-10,85,60,70};
		
		//Step1. Sort the array
		Arrays.sort(arr); //O(n log n)
		
		//Step 2: traverse using two pointers from left and right and keep track of abs(sum)
		// 		  if sum>0 then r-- ; if sum<0 l++
		int l =0;
		int r = arr.length-1;
		int sum;
		int minSum=Integer.MAX_VALUE;
		int i=l,j=r;
		while(l<r){
			sum = arr[l]+arr[r];
			if(Math.abs(sum)<minSum){
				i=l;
				j=r;
				minSum=Math.abs(sum);
			}
			if(sum>0)
				r--;
			else
				l++;

			
		}
		System.out.println(arr[i]+","+arr[j]);
		
	}
}
