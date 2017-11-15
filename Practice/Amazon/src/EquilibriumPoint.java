/*
 * Find the index such that left sum equals right sum
 */
public class EquilibriumPoint {

	public static void main(String[] args) {
		 int arr [] = {1,2,0,2,0,1};
		 
		 int rightSum =0,leftSum=0;
		 //Calculating initial total sum
		 for(int i : arr){
			 rightSum += i;
		 }
		 
		 for(int i=0;i<arr.length;i++){
			 rightSum = rightSum-arr[i];
			 if(rightSum == leftSum)
				 {
				 	System.out.println(i);
				 	return;
				 }
			 else{
				 leftSum += arr[i];
			 }
		 }
		 System.out.println("Not possible");
		 
		 
	}
}
