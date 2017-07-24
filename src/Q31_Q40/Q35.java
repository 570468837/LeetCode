package Q31_Q40;

public class Q35 {
	public static void main(String[] args){
		int nums[] = {1,3};
		System.out.println(new Q35().searchInsert(nums, 4));
	}
	
	 public int searchInsert(int[] nums, int target) {
			int lo = 0, hi = nums.length, mid = 0;
			//find the first num greater or equal to target
	        if(lo == hi-1)
				return nums[0] < target ? 1 : 0;
			while(lo<hi){
				mid = (lo + hi) / 2;
				if(nums[mid] >= target)
					hi = mid;
				else
					lo = mid+1;
			}
			return lo;
	    }
}
