
public class LongestPalindrome {
	

	public static void main(String args[]){
		String s = "baba";
		int max = LPS(s);
	}

	private static int LPS(String s) {
		int arr[][]=new int[s.length()][s.length()];
		for(int i =0;i<s.length();i++){
			for(int j=0;j<s.length();j++){
				if(i==j){
					arr[i][j]=1;
				}//else if(j==i+1 && s.charAt(i)==s.charAt(j)){
					//arr[i][j]=2;
				//}
			}
		}
		
		return function(s,arr,0,s.length()-1);
		
		
	}
 static int function(String s,int[][] arr, int i, int j) {
	 if(i<j){
		if(s.charAt(i)==s.charAt(j))
		{	if((i+1<s.length()-1)&&(j-1>=0))
				arr[i][j] = 2+function(s,arr,i+1,j-1);
		}else{
			if(i+1<s.length()-1&&j-1>=0)
			Math.max(function(s,arr,i+1,j), function(s,arr,i,j-1));
		}
	 }
		return arr[i][j];
	}
}
