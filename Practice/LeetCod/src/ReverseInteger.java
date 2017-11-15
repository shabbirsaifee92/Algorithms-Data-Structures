
public class ReverseInteger {

	public static void main(String args[]){
		int n = -2147447412;
		        
		
		boolean rev= reverse2(n);
		System.out.println(rev);

	}

	private static int reverse(int n) {
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder("");
		int k=0;
		if(n<0){
			k=1;
		}
		for(int i=s.length()-1;i>=k;i--){
			sb.append(s.charAt(i));
		}
		try{
			int reverse = Integer.parseInt(sb.toString());
			if(n<0){
				return -reverse;
			}
			return reverse;
			
			
		}
		catch(Exception e){
			return 0;
		}
		
	}
	
	
	private static boolean reverse2(int x){
		long n =x;
		long rev =0;
		try{
			while(x!=0){
				rev = rev*10;
				rev=rev+x%10;
				x=x/10;
				
			}
			if(rev>Integer.MAX_VALUE){
				return false;
			}
			if(rev<Integer.MIN_VALUE){
				return false;
			}
			if(rev==n){
				return true;
			}
		}catch(Exception e){
			return false;
		}
		return false;
	}
}
