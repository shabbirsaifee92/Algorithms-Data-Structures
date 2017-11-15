import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String args[]){
		String s = "MMXIV";
		int n = convertToInteger(s);
		System.out.println(n);
	}

	private static int convertToInteger(String s) {
		Map<Character,Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		if(s.length()==1){
			return map.get(s.charAt(0));
		}
		int res=map.get(s.charAt(0));
		char prev=s.charAt(0);
		for(int i =1;i<s.length();i++){
			char c = s.charAt(i);
			int n = map.get(c);
			if(prev=='I'&& (n==5||n==10)){
				res+=n-2;
			}
			else if(prev=='X'&& (n==50||n==100)){
				res+=n-20;
			}
			else if(prev=='C'&&(n==500||n==1000)){
				res+=n-200;
			}
			else{
				res+=n;
			}
			prev=c;
			
		}
		return res;
	}
}
