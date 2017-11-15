
public class MergeSortedArray {

	public static void main(String args[]){
		
		int [] nums1={1,3,9,0,0,0};
		int [] nums2={2,4,6};
		merge(nums1,3,nums2,3);
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int last = m+n;
		
		while(m>=0|| n>=0){
			if(nums1[m]>=nums2[n]){
				nums1[last]=nums1[m];
				m--;
			}
			else{
				nums1[last]=nums2[n];
				n--;
			}
			last--;
		}
		
	}
}
