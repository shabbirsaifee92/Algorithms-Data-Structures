/*
 * How to check if two String are Anagram?
 */
public class Anagram {

	public static void main(String args[]){
		String s1="mary";
		String s2="armys";
		boolean b=isAnagram(s1,s2);
		System.out.println(b);
	}

	private static boolean isAnagram(String s1, String s2) {
			
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i=0;i<s1.length();i++){
			String c = s1.charAt(i)+"";
			if(s2.indexOf(c)!=-1){
				continue;
			}
			else{
				return false;
			}
		}
		return true;
	}
}
