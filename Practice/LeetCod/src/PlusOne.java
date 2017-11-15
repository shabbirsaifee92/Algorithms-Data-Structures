import java.util.LinkedList;
import java.util.List;

public class PlusOne {
	
	public static void main(String args[]){
		int[] digits={9,8,7,6,5,4,3,2,1,0};
		int[] newNum=plusOne(digits);
	}

	private static int[] plusOne(int[] digits) {
		
		int length = digits.length;
		for(int i =length-1;i>=0;i--){
			if(digits[i]<9){
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		
		int[] newSum = new int[length+1];
		newSum[0]=1;
		return newSum;
		
		
		
	}
}
