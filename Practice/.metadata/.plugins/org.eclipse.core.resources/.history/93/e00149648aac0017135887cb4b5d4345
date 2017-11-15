/*
 * 
 * Mthod 1) using hash map ==> O(n) time and O(n) space
 * Method 2) Moores majority element
 */
public class MajorityElement {

	
	
	public static void main(String[] args) {
		int arr [] = {3,3,4,2,4,4,2,4,4};
		int majority = getMajorty(arr);
		boolean b = isMajority(arr,majority);
		if(b){
			System.out.println(majority);
		}else{
			System.out.println("NONE");
		}
		
	}
	private static boolean isMajority(int[] arr, int majority) {
		int count =0;
		for(int i =0;i<arr.length;i++){
			if(majority==arr[i])
				count++;
		}
		if(count>arr.length/2)
			return true;
		return false;
	}
	private static int getMajorty(int[] arr) {
		 int maj_index =0;
		 int count =1;
		 
		 for (int i =1;i<arr.length-1;i++){
			 
			 if(arr[i]==arr[maj_index]){
				 count++;
			 }else{
				 count--;
			 }
			 
			 if(count <=0){
				 maj_index =i;
				 count =1;
			 }
		 }
		return arr[maj_index];
	}
}
