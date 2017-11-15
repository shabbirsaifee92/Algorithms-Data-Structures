
public class SearchInsertPosition {

	public static void main(String args[]) {
		int[] nums = { 1};
		int target = 0;
		int index = searchInsert(nums, target);
		System.out.println(index);
	}

	private static int searchInsert(int[] nums,int target) {
		int start =0;
		int end=nums.length-1;
		while(start<=end){
			int mid = (start+end)/2;
			if(nums[mid]==target) return mid;
			else if(target>nums[mid]) start=mid+1;
			else if(target<nums[mid]) end=mid-1;
		}
		return start; 
		
		
	}
}
