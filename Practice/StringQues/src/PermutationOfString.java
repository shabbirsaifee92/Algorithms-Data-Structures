
public class PermutationOfString {
	public static void main(String[] args) {

		String s = "ABC";
		permute("",s);
	}
	
	static void permute(String fixed, String rem){
		
		if(rem.length()==0){
			System.out.println(fixed);
		}
		else{
			
			for(int i=0;i<rem.length();i++){
				permute(fixed+rem.charAt(i),rem.substring(0, i)+rem.substring(i+1,rem.length()));
			}
		}
	}

	
}
