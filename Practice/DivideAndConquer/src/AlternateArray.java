
public class AlternateArray {

	static int[] a ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
	public static void main (String[] args){
		
	
	
	AlternateArray o = new AlternateArray();
	o.divideAndConquer(0, a.length-1);
	for(int i =0; i< a.length ; i++){
		System.out.print(a[i]+" ");
	}
	//System.out.println(a);
}

	private void divideAndConquer( int start, int end) {
		
		if(start<=end){
			
		
		if(end-start+1==2){
			return ;
		}
		int mid = (start+end)/2;
		
		divideAndConquer(start, mid);
		divideAndConquer(mid+1, end);
		merge(start,mid, end);
	}
	}

	private void merge(int start,int mid, int end) {

		int c=0;
		for(int i=start;i<=mid;i++){
			
			if(i%2 !=0){
				swap(i,mid+c);				
			}
			c++;
		}
		
	}

	private void swap(int i, int j) {
		// TODO Auto-generated method stub
		
		int t = a[i];
		a[i]= a[j];
		a[j]=t;
	}

}
