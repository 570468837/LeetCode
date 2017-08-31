package Q051_Q060;

public class Q55 {
	public static void main(String[] args) {
		new Q55().canJump(new int[]{2,3,1,1,4});
	}
	
	public boolean canJump(int[] nums) {
		
		return backtrack(0, nums);
	}
	
	public boolean backtrack(int cur, int nums[]){
		boolean res = false;
		if(cur > nums.length-1)
			return false;
		else if (cur == nums.length-1)
			return true;
		else{
			for(int i=1; i<=nums[cur]; i++){
				res = res || backtrack(cur+i, nums);
				if(res)
					return res;
			}
		}
		return res;
	}
}
