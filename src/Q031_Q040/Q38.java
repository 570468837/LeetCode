package Q031_Q040;

public class Q38 {
	public String countAndSay(int n){
		if(n==1)
			return new String("1");
		String res = "";
		//the max num is 3.
		int[] nums = new int[4];
		String s = countAndSay(n-1);
		//initial prev
		int prev = -1;
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			int num_c = Integer.valueOf(String.valueOf(c));
			nums[num_c] ++;
			if(num_c != prev && prev != -1){
				res += (nums[prev] + String.valueOf(prev));
				nums[prev] = 0;
			}
			prev = num_c;
		}
		if(s.substring(s.length()-1).equals(String.valueOf(prev))){
			res += (nums[prev] + String.valueOf(prev));
		}
		return res;
	}
}
