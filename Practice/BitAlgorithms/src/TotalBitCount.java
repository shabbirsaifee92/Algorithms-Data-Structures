import java.util.Scanner;

public class TotalBitCount {

	
	public static void main(String args[]){
		//System.out.println(0x0f);
		
		System.out.println("Enter an integer");
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int totalBits=0;
		for(int i =1;i<=n;i++){
			totalBits += countBits(i);
		}
		
		System.out.println("Number of set bits:"+totalBits );
	}

	private static int countBits(int n) {
		
		int bitTable[] = {0,1,1,2,1,2,2,3,1,2,2,3,2,3,3,4};
		int count = 0;
		while(n > 0){
			count += bitTable[n & 0x0f];
			n=n>>4;
		}
		
		return count;
	}
}
