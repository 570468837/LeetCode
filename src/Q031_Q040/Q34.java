package Q031_Q040;

public class Q34 {
	public int[] searchRange(int[] nums, int target) {
        int lo = 0, hi = nums.length-1, mid = 0;
        int find = -1, left, right;
        while(lo <= hi){
        	mid = (lo + hi) / 2;
        	if(nums[mid] == target){find = mid; break;}
        	if(nums[mid] > target)
        		hi = mid - 1;
        	else
        		lo = mid + 1;
        }
        
        if(find == -1)
        	return new int[]{-1,-1};
        for(left=mid; left>=lo && nums[left] == target; left--){};
        left++;
        for(right=mid; right<=hi && nums[right] == target; right++){};
        right--;
        
		return new int[]{left, right};
    }
}
