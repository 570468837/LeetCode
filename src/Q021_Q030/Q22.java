package Q021_Q030;

import java.util.ArrayList;
import java.util.List;

public class Q22 {
	public static void main(String[] args) {
		Q22 q = new Q22();
		List<String> list = q.generateParenthesis(3);
		for(String s: list)
			System.out.println(s);
	}
	
	public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        helper(res,"",n,n,n);
		return res;
    }
	
	public void helper(List<String> res, String temp, int left, int right, int total){
		if(left == 0 && right == 0){
			res.add(temp);
			return;
		}

		if(left > 0)
			helper(res, temp+"(", left-1, right, total);
		if(left < right)
			helper(res, temp+")", left, right-1, total);
		return;
	}
}
