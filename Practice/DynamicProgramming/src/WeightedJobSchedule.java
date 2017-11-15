import java.util.Arrays;

public class WeightedJobSchedule {

	
	public static void main(String [] args){
		
	//	int [] start ={0,1,3,0,4,3,5,6,8};
	//	int [] end= {0,4,5,6,7,8,9,10,11};
	//	int [] profit= {0,1,2,3,4,5,6,7,8};

		int [] start ={0,1,3,6,2};
		int [] end= {0,2,5,19,100};
		int [] profit= {0,50,20,100,200};   
	       
		WeightedJobSchedule o = new WeightedJobSchedule();
		int p= o.calMaxProfit(start,end,profit);
	}

	private int calMaxProfit(int[] start, int[] end,int []profit) {
		
		int[]p = new int[start.length]; // setting pre array 
		// store no of jobs that have finished before job at i has started
		for (int i =1;i<p.length;i++ ){
			for(int j =1;j<i;j++){
				
				if(end[j]<= start[i]){
					p[i]+=1;
				}
			}
		}
		
		int[] opt = new int[start.length];
		
		for(int i =1;i<opt.length; i++){
			
			opt[i]= Math.max( profit[i]+opt[p[i]] , opt[i-1]);
		}
	
		
		// find maximum profit 
		int max =0;
		for(int i =1;i<opt.length;i++){
			
			if(max<opt[i])
				max=opt[i];
		}
		
		return max;
		
		
		

	}
}
