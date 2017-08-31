package Q001_Q010;

public class Q3 {
	public static void main(String[] args){
		Q3 q =new Q3();
		System.out.println(q.lengthOfLongestSubstring("bbtablud"));
	}
	public int lengthOfLongestSubstring(String s) {
		if(s==null || s.length()==0)
			return 0;
		
        int head = 0; int tail = 0;
        int longest = 1;
        while(++tail < s.length()){
        	char c = s.charAt(tail);
        	int index = ifAppeared(s.substring(head, tail), c);
        	if(index == -1){
        		int length = tail-head+1;
        		longest = Math.max(length, longest);
        	}
        	else{
        		head = head+index+1;
        	}
        		
        }
        
		return longest;
    }
	
	int ifAppeared(String substr, char c){
		return substr.indexOf(String.valueOf(c));
	}
	
}
