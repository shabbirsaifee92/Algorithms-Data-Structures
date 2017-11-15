/*
 * Given an array of integers, sort the array using a given Flip operation.
 * This is called Pancake sorting because this uses Flip operation which is analogous to flipping pancakes.
 * For example, if there are 5 pancakes stacked one of top of the other,
 * then Flip operation is when a spatula is inserted at any point in the stack 
 * and then turned upside down flipping all pancakes above it.
 * 
 * Flip operation is defined on the array as:
 * Flip(array, end) = reverse the array elements from 0 to end (inclusive)
 * Example:
 * Consider the array:
 * array[] = {4,1,2,5,3}
 */
public class PancakeSort {

	int a[] = {4,1,2,5,3};
	public static void main(String arg[]){
		
		PancakeSort o = new PancakeSort();
		o.sort();
	}

	private void sort() {
		
		for(int i =0;i<a.length;i++){
			int end = a.length-i-1;
			int j = findLargestElement(0,end);
			reverse(0,j);
			reverse(0,end);
			System.out.println();
		}
		
	}

	private void reverse( int start, int end) {
		if(start==end)
			return;
		int p =0;
		for(int i = start;i<= (start+end)/2;i++)
			{
			int t = a[i];
			a[i]=a[end-p];
			a[end-p]=t;
			p++;
			System.out.println();
			
			
		}
		
	}

	private int findLargestElement(int i, int end) {
		int max = Integer.MIN_VALUE;
		int ind=-1;
		for(int k = 0 ;k<=end;k++){
			if(a[k]>max){
				max= a[k];
				ind = k;
			}
		}
		return ind;
	}
}
