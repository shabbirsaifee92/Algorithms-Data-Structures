
public class MaxProfitRod {

	
	public static void main(String [] args){
		
		int [] length={0,1,2,3,4,5,6};
		int [] cost={0,1,3,5,6,7,10};
		
		int n =20;
		int best []= new int[n+1];
		for(int i=0 ;i<=n ; i++){
			best[i]=0;
		}
		
		MaxProfitRod o = new MaxProfitRod();
		int maxProfit[]= o.calculateMaxProfit(n,cost,best);
		while(n>0){
			System.out.println(maxProfit[n]+" ");
			n = n-maxProfit[n];
			
		}
		
	}

	private int [] calculateMaxProfit(int length, int[] cost,int[] best) {
		
		int [] s= new int[length+1];
		// int max = -999;
		if(length<=0){
			return s;
		}
		
		
		for(int i = 1;i<=length ;i++){
			
			for(int j =1;j<= Math.min(i, 6);j++)
			{
				int t = cost[j] + best[i-j];
				if(t>best[i]){
					best[i]=t;
					s[i]= j;
				}
			}
			
		}
		
		return s;
		//Find max of all the options 
		
		
		
	}
}
