package Q31_Q40;

public class Q33 {
	public static void main(String[] args) {
		Q33 q = new Q33();
		int[] nums = {1};
		System.out.println(q.search(nums, 0));
	}
	public int search(int[] nums, int target) {
		if(nums.length == 0)
			return -1;
		int lo = 0, hi = nums.length-1;
		int mid = 0;
		while(lo <= hi){
			mid = (lo + hi)/2;
			if(nums[mid] == target) 
				return mid;
			if(nums[mid] < nums[hi]){
				if(nums[mid] > target) hi = mid-1;
				else if(nums[hi] < target) hi = mid-1;
				else lo = mid+1;
			}
			//nums[mid] >= nums[hi]
			else{
				if(nums[mid] < target) hi--;
				else if(nums[hi] >= target) lo = mid+1;
				else hi = mid-1;
			}
		}
        return nums[mid] == target? mid: -1;
    }
}
