/*
 * Making Change. You are given n types of coin denominations of values v(1) < v(2) < ... < v(n) (all integers). 
 * Assume v(1) = 1, so you can always make change for any amount of money C. 
 * Give an algorithm which makes change for an amount of money C with as few coins as possible.
 * 
 * */

public class MakingChange {

	
	public static void main(String [] args){
		
		int[] coins={1,5,6,9};
		int count = 11;
		
		MakingChange o = new MakingChange();
		o.makeChange(coins,count);
	}

	private int makeChange(int[] coins, int count) {
		       
		int [] b = new int[count+1];
		b[1]=1;
		b[6]=1;
		b[5]=1;
		b[9]=1;

		for(int k=0;k<b.length;k++){
			if(b[k]!=1)
				b[k]=Integer.MAX_VALUE;
		}
		for(int i =1;i<=count;i++){
			for(int j=1; j<=Math.min(i, 5); j++){
				if(i==j){
					b[i-j]=0;
				}
					int t = b[j]+b[i-j];
					if(t<b[i]){
						b[i]=t;
					}
					
				
				
			}
		}
		return b[count];
		
	}
}
