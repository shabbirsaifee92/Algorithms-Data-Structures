
public class RemoveElement {

	public static void main(String args[]){
		int[] nums={3,2,2,3};
		int val=3;
		int length=removeElement(nums,val);
	}

	private static int removeElement(int[] nums, int val) {
		if(nums.length==0){
			return 0;
		}
		int new_length=nums.length;
		int i =0;
		while(i!=new_length-1){
			if(nums[i]==val){
				nums[i]=nums[new_length-1];
				new_length--;
				
			}
			else{
				i++;
			}
		}
		return new_length;
	}
}
