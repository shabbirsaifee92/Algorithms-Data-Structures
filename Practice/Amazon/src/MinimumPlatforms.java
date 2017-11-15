import java.util.Arrays;

/*
 * given arrival and departure time of trains for a stations find the minimum number of platforms
 */
public class MinimumPlatforms {
	public static void main(String[] args) {
		
		// We have to sort the array according to the arrival time O(n log n)
		// Here assume we have arrays in sorted order according to the arrival time
	
		int arr[] = {900, 940, 950, 1100, 1500, 1800};
	    int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
	    Arrays.sort(arr);
	    Arrays.sort(dep);
	    
	    int platforms =1,max =1;
	    int i=1,j=0;
	    while( i<arr.length  && j <arr.length){
	    	
	    	if(arr[i]<dep[j]){
	    		platforms++;
	    		max = Math.max(platforms, max);
	    		i++;
	    	}else{
	    		j++;
	    		platforms--;
	    	}
	    }
	    System.out.println(max);
	}
	
	
}
