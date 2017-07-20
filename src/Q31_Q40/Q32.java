package Q31_Q40;

import java.util.Stack;

public class Q32 {
	public static void main(String[] args) {
		Q32 q = new Q32();
		System.out.println(q.longestValidParentheses2(new String("()()")));
	}
	
	public int longestValidParentheses(String s) {
		int[] isEffe = new int[s.length()];
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == '('){
				stack.push(i);
			}	
			else{
				if(!stack.isEmpty()){
					int left = stack.pop();
					isEffe[left] = 1;
					isEffe[i] = 1;
				}
			}
		}
		if(stack.size()==s.length())
			return 0;
		return maxLength(isEffe);
        
    }

	private int maxLength(int[] isEffe) {
		int max = 0;
		// TODO Auto-generated method stub
		for(int i=0; i<isEffe.length; i++){
			if(isEffe[i] == 1){
				int head = i;
				while(i<isEffe.length-1 && isEffe[++i]==1){};
				if(i==isEffe.length-1){
					max = max<i-head+isEffe[i] ? i-head+isEffe[i] : max;
					break;
				}
				max = max<i-head? i-head : max;
			}
		}
		return max;
	}
	
	public int longestValidParentheses2(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }
	
}
