
public class RemoveDuplicateArray {

	public static void main(String args[]){
		int[] array={1,2,3,4};
		int l = getlength(array);
		System.out.println(l);
	}

	private static int getlength(int[] array) {
		if(array.length==1){
			return 1;
		}
		if(array.length==0){
			return 0;
		}

		int k=1;
		for(int i =1;i<array.length;i++){
			if(array[i-1]!=array[i]){
				array[k]=array[i];
				k++;
			}
		}
		return k;
	}
}
