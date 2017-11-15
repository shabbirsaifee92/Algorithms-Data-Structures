/*
 * Problem statement: Consider a row of n coins of values v1 . . . vn, where n is even.
 *  We play a game against an opponent by alternating turns. 
 *  In each turn, a player selects either the first or last coin from the row, 
 *  removes it from the row permanently, and receives the value of the coin.
 *   Determine the maximum possible amount of money we can definitely win if we move first.
 */

public class OptimalGameStrategy {

	public static void main(String[] args){
		int value[] ={5, 3, 7, 10};

		int amount[][]=new int[value.length][value.length];
		int max=getMaxMoney(value,amount);
		System.out.println(max);
	}

	private static int getMaxMoney(int[] value, int[][] amount) {
		
		int n = value.length;
		int x ,y,z;
		for(int k=0;k<n;k++){
			for(int i =0, j=k; j<n; j++, i++){
				
				int vi=value[i];
				int vj=value[j];
				// Here x is value of F(i+2, j), y is F(i+1, j-1) and
	            // z is F(i, j-2) in above recursive formula
	            x = ((i+2) <= j) ? amount[i+2][j] : 0;
	            y = ((i+1) <= (j-1)) ? amount[i+1][j-1] : 0;
	            z = (i <= (j-2))? amount[i][j-2]: 0;
	            
	            amount[i][j]=  Math.max(vi+Math.min(x, y) ,vj+Math.min(y, z) );
			}
		}
		return amount[0][n-1];
	}
}
