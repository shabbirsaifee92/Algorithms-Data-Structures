
public class LCSOf1 {

	
	public static void main(String args[]){
		
		
		int a[]={1,1,0,1,1,1,0,1,0};
		int count[] = new int [a.length];
		int c =0;
		int ind =-1;
		// traverse to find right side of 0
		
		for(int i =0;i<a.length;i++){
			
			if(a[i]==0){
				if(ind>-1)				
					count[ind]=c;
				ind=i;
				c=0;
				
			}
			else{
				c++;
			}
				
		}
		// traverse to find left side of 0
		
		for(int i =a.length-1;i>=0;i--){
			
			if(a[i]==0){
				if(ind>-1)				
					count[ind]+=c;
				ind=i;
				c=0;
				
			}
			else{
				c++;
			}
				
		}
		int max=0;
		int res=-1;
		for(int i =0;i<count.length;i++){
			if(count[i]>max)
			{
				max= count[i];
				res=i;
			}
				
		}
		
		System.out.println();
	}
}
