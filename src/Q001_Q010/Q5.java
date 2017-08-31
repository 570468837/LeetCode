package Q001_Q010;
/**
 * Longest Palindromic Substring
 * @author FrankYao
 */
public class Q5 {
	
	public static void main(String[] args) {
		Q5 q = new Q5();
		String s = new String("baabaacaab");
		System.out.println(q.longestPalindrome(s));
	}
	
	public String longestPalindrome(String s) {
        int maxId = -1; int id = -1;
        int longest = 0; String longestStr = "";
        String postStr = preprocessStr(s);
        //P[i] means the 1/2 length of the longest palindromic substring centering around postStr[i].
        int[] P = new int[postStr.length()];
        for(int i=1; i<postStr.length(); i++){
        	if(i < maxId)
        		P[i] = Math.min(P[2*id-i], maxId-i);
        	else
        		P[i] = 0;
        	
        	while(indexValid(postStr, i, P[i]+1) &&
        			postStr.charAt(i+P[i]+1) == postStr.charAt(i-P[i]-1)){
        		P[i]++;
        	}
        
        	if(i+P[i] > maxId){
        		maxId = i+P[i];
        		id = i;
        	}
        	
        	if(longest < P[i]){
        		longest = P[i];
        		longestStr = postStr.substring(i-P[i], i+P[i]+1);
        	}
        }
		
        if(longestStr.equals("*"))
        	longestStr = String.valueOf(postStr.charAt(1));
        
        // eg: 1*2*3*2*1  1*2*2*1
		return recoverStr(longestStr);
    }
	
	String preprocessStr(String s){
		String res = "*";
		for(char c: s.toCharArray()){
			res += c;
			res += '*';
		}
		return res;
	}
	
	String recoverStr(String s){
		String res = "";
		for(int i=1; i<s.length(); i=i+2){
			res += s.charAt(i);
		}
		return res;
	}
	
	boolean indexValid(String s, int i, int offset){
		return i+offset<s.length() && i-offset>=0;
	}
}
