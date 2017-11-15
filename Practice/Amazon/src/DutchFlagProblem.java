/*
 * sort array of 0s 1s and 2s in a single loop
 * 
 */
public class DutchFlagProblem {

	public static void main(String[] args) {
		 int a [] =  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		 
		 int low = 0,mid = 0,high = a.length-1;
		 while(mid<=high){
			 
			 switch(a[mid]){
			 	case 0:
			 		swap(a,mid,low);
			 		mid++;
			 		low++;
			 		break;
			 	case 1:
			 		mid++;
			 		break;
			 	case 2: 
			 		swap(a,mid,high);
			 		high--;
			 		break;
			 	default: 
			 		break;
			 }
		 }
		 
		 for(int i : a){
			 System.out.print(i+" ");
		 }
	}

	private static void swap(int[] a, int i, int j) {
		a[i] = a[i]+a[j];
		a[j] = a[i]-a[j];
		a[i]= a[i]-a[j];
		
	}
}
