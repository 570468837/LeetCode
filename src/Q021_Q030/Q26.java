package Q021_Q030;

public class Q26 {
	public int removeDuplicates(int[] nums) {
	     int count = 0;
	     for(int i=1; i<nums.length; i++){
	         if(nums[i] != nums[i-1])
	             nums[i-count] = nums[i];
	         else
	             count++;
	     }
	        return nums.length-count;
	    }
}
