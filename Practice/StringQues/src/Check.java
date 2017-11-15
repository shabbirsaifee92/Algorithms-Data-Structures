
public class Check {

	
	public static void main(String args[]){
		
		StringBuilder s1 = new StringBuilder("5");
		StringBuilder s2 = new StringBuilder("3");
		Integer i = 5;
		Integer j = 3;
		swap(i,j);
		System.out.println(i.intValue()+" "+j.intValue());
	}

	private static void swap(Integer i, Integer j) {
		Integer t = i;
		 i= j.intValue();
		 j =t.intValue();
		//s2.
		
	}
}
