
public class LongestPalindromicSubString {
	
	
	public static void main(String[] args) {
		String s = "arora";
		int n = longestPalindrome(s);
		
	}
	private static int longestPalindrome(String s) {
		 
		int n = s.length();
		int table[][] = new int[n][n];
		int i =0,j=n-1;
		recurse(table,i,j,s);
		return 0;
	}
	private static int recurse(int[][] table, int i, int j,String s) {
		
		
		while(i<=j){
			if(i == j)
				return 1;
			if(s.charAt(i)==s.charAt(j)){
				table[i] [j] = 2+  recurse(table,i+1,j-1,s);
			}else{
				
				table[i][j] = Math.max(recurse(table,i+1,j,s), recurse(table,i,j-1,s));
			}
		}
		
		
		return 0;
	}
	
}
