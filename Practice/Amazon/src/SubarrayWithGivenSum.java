import java.util.HashMap;

/*
 * find sub array with given sum where array inclused negative integers
 */
public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		
		int arr [] = {10, 2, -2, -20, 10};
		int sum = 0;
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int cur_sum =0;
		
		for(int i =0;i<arr.length;i++){
			// calculate the total sum till i
			cur_sum += arr[i];
			
			//Case a)
			//If current sum is sum then 0 to i is the sub array
			if(cur_sum ==sum){
			System.out.println("Sum of elements from 0 to " + i);
			return;
			}
			
			//Case b)
			if(map.containsKey(cur_sum-sum)){
				System.out.println("sum of elements from "+(map.get(cur_sum-sum)+1) +" to "+i);
				return;
			}else{
				map.put(cur_sum, i);
			}
			
			
		}
		System.out.println("No sub array found");
	}
}
