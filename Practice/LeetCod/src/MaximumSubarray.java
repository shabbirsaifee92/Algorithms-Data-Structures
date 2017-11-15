
public class MaximumSubarray {

	public static void main(String args []){
		int nums[]={-2,1,-3,4,-1,2,1,-5,4};
		int max = maxSubArray(nums);
		System.out.println(max);
		}

	private static int maxSubArray(int[] nums) {
		
		if(nums.length==1){
			return nums[0];
		}
		if(nums.length==0){
			return 0;
		}
		
		int maxSum=nums[0];
		int max[]= new int[nums.length];
		max[0] = nums[0];
		for(int i=1;i<nums.length;i++){
			max[i] = Math.max(max[i-1]+nums[i],nums[i]);
			if(maxSum<max[i]){
				maxSum=max[i];
			}
		}
		return maxSum;
	}
}
