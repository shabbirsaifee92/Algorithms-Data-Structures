
public class LongestCommonPrefix {

	public static void main(String [] args){
		String s[]={"shabbir","shabz","sha","sh"};
		String lcp = longestCommonPrefix(s);
		System.out.println(lcp);
	}

	private static String findLCP(String[] s) {
		if(s.length==0){
			return "";
		}
		
		if(s.length==1){
			return s[0];
		}
		String lcp=s[0];
		for(int i =0;i<s.length-1;i++){
			String min;
			String cur_lcp="";
			if(s[i].length()<s[i+1].length()){
				min=s[i];
			}
			else{
				min=s[i+1];
			}
			for(int j =0;j<min.length();j++){
				if(s[i].charAt(j)==s[i+1].charAt(j)){
					cur_lcp+=s[i].charAt(j);
				}
				else{
					break;
				}
			}
			if(cur_lcp.length()<lcp.length()){
				lcp=cur_lcp;
			}
			if(lcp==""){
				return lcp;
			}
		}
		return lcp;
	}
	
	public static String longestCommonPrefix(String[] strs) {
        
		 if(strs == null || strs.length == 0)    return "";
   String pre = strs[0];
   int i = 1;
   while(i < strs.length){
       while(strs[i].indexOf(pre) != 0)
           pre = pre.substring(0,pre.length()-1);
       i++;
   }
   return pre;
   }
}
