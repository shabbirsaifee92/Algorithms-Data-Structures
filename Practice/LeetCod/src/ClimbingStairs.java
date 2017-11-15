
public class ClimbingStairs {

	public static void main(String args[]){
		int n=100;
		int now=climbStairs(n);
		System.out.println(now);
	}

	private static int climbStairs(int n) {
		if(n==0){
			return 0;
		}
		int[] now=new int[n+1];
		now[0]=0;
		now[1]=1;
		now[2]=2;
		for(int i=3;i<=n;i++){
			now[i]=now[i-1]+now[i-2];
		}
		return now[n];
	}
}
