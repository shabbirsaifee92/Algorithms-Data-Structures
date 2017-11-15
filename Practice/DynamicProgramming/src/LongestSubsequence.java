
public class LongestSubsequence {

	
	public static void main(String [] args){
		
		int [] a = { 1, 12, 7, 0, 23, 11, 52, 31, 61, 69, 70, 2 };
		
		LongestSubsequence o = new LongestSubsequence();
		int []lis  = o.findLIS(a);
		int max=0;
		for(int i=0;i<lis.length;i++){
			
			if(lis[i]>max)
			{
				max=lis[i];
				System.out.print(a[i]+" ");
			}
		}
	}

	private int[] findLIS(int[] a) {
		
		int b[]= new int[a.length];
		b[0]=1;
		for(int i=1;i<a.length;i++){
			b[i]=Integer.MIN_VALUE;
			int j =0;
			while( j< i){
				if(a[i]>a[j]){
					b[i]=Math.max(b[j]+1, b[i]);
				}
				j++;
			}
			if(b[i]==Integer.MIN_VALUE){
				b[i]=1;
			}
		}
		
		return b;
	}
}
