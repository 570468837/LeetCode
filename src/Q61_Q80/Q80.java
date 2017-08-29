package Q61_Q80;

public class Q80 {
	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		System.out.println(new Q80().removeDuplicates(nums));
	}
	
	public int removeDuplicates(int[] nums) {
	    int count = 0;
	    for (int i=0; i<nums.length; i++ ){
	        if (i>=2 && nums[i] == nums[i-count-2])
	            count++;
	        else 
	        	nums[i-count] = nums[i];
	    }
	    return nums.length-count;
	}
	
}
