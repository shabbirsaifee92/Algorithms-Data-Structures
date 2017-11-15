import java.util.HashMap;

public class TwoSum {
public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i:nums){
            
            if(map.get(target-i)!=null){
                res[0]= target-i;
                res[1] = i;
                return res;
            }
            else{
                map.put(i,i);
            }
        }
        return res;
    }
public static int[] twoSum2(int[] nums, int target){
	int i , j;
	int [] res = new int[2];
	i = 0;
	j = nums.length-1;
	for(int k =0;k< nums.length;k++)
	{
	if(nums[i]>target){
		i++;
	}
	if(nums[j]>target){
		j--;
	}
	if(nums[i]+nums[j]==target)
	{
		res[0]=i;
		res[1]=j;
		return res;
	}
	else{
		i++;j--;
		}
	}
	return nums;
	
}

public static void main(String args[]){
	int nums[] = {3,2,4};
	int target = 6;
	twoSum2(nums,target);
}
}
