
public class MaximumSubsequenceSum {

	
	public static void main(String [] args){
		
		int [] a = {-2,-3,4,-1,-2,1,5,-3};
		
		MaximumSubsequenceSum o = new MaximumSubsequenceSum();
		int sum = o.calculateMaxSum(a);
		System.out.println(sum);
	}

	private int calculateMaxSum(int[] a) {
		
		if(a.length>1){
			
			int [] sum = new int[a.length];
			int max = a[0];
			
			sum[0]=a[0];
			int start=0;
			int end=0;
					
			
			for(int i =1;i<a.length;i++){
				
				if(a[i]+sum[i-1]>a[i]){
					sum[i]=a[i]+sum[i-1];
					
				}
				else{
					sum[i]=a[i];
					start=i;
				}
				//sum[i]= Math.max(a[i]+sum[i-1], a[i]);
				if(sum[i]>max){
					max=sum[i];
					end = i;
				}
					
			}

			return max;
			
		}
		return a[0];
	}
}
