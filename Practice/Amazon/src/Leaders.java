/*
 * print all the leaders in the array. Leader is number s.t all the elements on its right is smaller thean it.
 */
public class Leaders {

	public static void main(String[] args) {
		
		int arr[] = {16, 17, 4, 3, 5, 2};
		int max;
		//Base case
		max = arr[arr.length-1];
		System.out.println(max);
		for(int i =arr.length-2;i>=0;i--){
			if(arr[i]>max){
				max = arr[i];
				System.out.println(max);
				
			}
		}
	}
}
