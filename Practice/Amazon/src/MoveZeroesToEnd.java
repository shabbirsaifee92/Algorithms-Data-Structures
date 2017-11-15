/*
 * Move all zeros to the end of the array
 */
public class MoveZeroesToEnd {

	public static void main(String[] args) {
		int arr [] = 	{1,9,8,4,0,0,2,7,0,6,0};
		 
		 for(int i : modifyArra(arr)){
			 System.out.print(i+" ");
		 }
		 
	}

	private static int[] modifyArra(int[] arr) {
		int count =0;
		for(int i =0;i<arr.length;i++){			
			if(arr[i]!=0){
				//swap with arr[count]
				int temp =arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				//increment count
				count++;
			}
		}
		return arr;
	}
	
}
