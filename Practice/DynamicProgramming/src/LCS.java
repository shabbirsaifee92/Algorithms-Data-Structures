
public class LCS {

	
	public static void main(String [] args){
		
		String p="acbea";
		String q="adca";
		
		LCS o = new LCS();
		int l = o. calculateLCS(p,q);
	}

	private int calculateLCS(String p, String q) {
		
		int max = 0;
		int rows=p.length()+1;
		int col=q.length()+1;
		int [][] longest = new int[rows][col];
		for(int i = 1;i<rows;i++){
			for(int j =1;j<col;j++){
				
				// case 1: when characters are same
				if(p.charAt(i-1)==q.charAt(j-1)){
					longest[i][j]= 1 + longest[i-1][j-1];
				}
				
				//case 2: when characters are not same
				else {
						longest[i][j] = Math.max(longest[i-1][j],longest[i][j-1]);
				}
			
			}
		}
		return 0;
	}
}
