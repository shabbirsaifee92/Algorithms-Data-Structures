/*
 * aray containing multiple duplicates
 * 
 */
public class DuplicatesInArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,1,3,6,4};
	
	for(int i=0;i<arr.length;i++){
		if(arr[Math.abs(arr[i])]>0){
			arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
		}
		else{
			System.out.println("Found repeated number "+Math.abs(arr[i]));
		}
	}
}
}
