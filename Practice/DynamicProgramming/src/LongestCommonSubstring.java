
public class LongestCommonSubstring {

	
	public static void main(String args[]){
		
		String s1="abxxc";
		String s2= "adxxc";
		
		LongestCommonSubstring o = new LongestCommonSubstring();
		String s = o.findLCS(s1,s2);
		System.out.println(s);
	}

	private String findLCS(String s1, String s2) {
		
		int [][] longest = new int[s2.length()][s1.length()];
		int row =longest.length;
		int column =longest[0].length;
		int max=0;
		String longestSubstring ="";
		for(int i =0;i<row;i++){
			
			for(int j =0;j<column;j++){
				
				if(s2.charAt(i)==s1.charAt(j)){
					
					if( (i-1)>=0&& (j-1)>=0)
						longest[i][j]=1+longest[i-1][j-1];
					else
						longest[i][j]=1;
				}
				
				if(longest[i][j]>max)
				{
					max = longest[i][j];
					longestSubstring = s1.substring(j-max+1, j+1);
				}
				
			}
		}
		return longestSubstring;
		
	}
}
