import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String args[]){
		String s = "abcabcbb";
		int max = findLongestSubstring2(s);
		System.out.println(max);
	}

	private static int findLongestSubstring2(String s){
		
		if(s.length()==0){
			return 0;
		}
		if(s.length()==1){
			return 1;
		}
		int max=0;
		int start=0;
		int len=s.length();
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<len;i++){
			char c = s.charAt(i);
			if(map.containsKey(c) && map.get(c)>=start){
				start = map.get(c)+1;
			}
			
			map.put(c, i);
			max=Math.max(max, i-start+1);
		}
		
		return max;
		
		
		
	}
	private static int findLongestSubstring(String s) {
		// TODO Auto-generated method stub
		int max=0;
		for(int i =0;i<s.length();i++)
		{
			int cur_max=1;
			String sb = String.valueOf(s.charAt(i));
			for(int j=i+1;j<s.length();j++){
				if(sb.contains(String.valueOf(s.charAt(j)))){
					break;
				}else{
					sb=sb+s.charAt(j);
					cur_max++;
				}
			}
			if(cur_max>max)
				max=cur_max;
		}
		return max;
	}
}
