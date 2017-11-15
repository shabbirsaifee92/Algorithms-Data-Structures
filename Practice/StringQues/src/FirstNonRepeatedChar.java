import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String s = "GEEKSQUIZ";
		char c = findFNC(s);
		System.out.println(c);
	}

	private static char findFNC(String s) {
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		int i =0;
		while(i<s.length()){
			Character key = s.charAt(i);
			if(map.containsKey(key)){
				Integer count = map.get(key);
				count++;
				map.put(key, count);
			
			}
			else{
				map.put(key, 1);
			
			}
			i++;
		}
		
		for(Character key : map.keySet())
		{
			if(map.get(key)==1)
				return key;
		}
		
		return 0;
	}
}
