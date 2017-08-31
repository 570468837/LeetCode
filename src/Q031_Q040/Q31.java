package Q031_Q040;

import java.util.Arrays;

public class Q31 {
	public void nextPermutation(int[] nums) {
		int length = nums.length;
		int head = -1;
        for(int i=length-1; i>=1; i--){
        	if(nums[i-1] < nums[i]){
        		head = i-1;
        		break;
        	}
        } 
        if(head == -1){
        	Arrays.sort(nums);
        	return;
        }
        //swap
        for(int i=length-1; i>head; i--){
        	if(nums[i] > nums[head]){
        		swap(nums, i, head);
        		break;
        	}
        }
        //ascend after nums[head]
        Arrays.sort(nums, head+1, length);
    }
	
	
	
	void swap(int[] nums, int m, int n){
		int temp = nums[m];
		nums[m] = nums[n];
		nums[n] = temp;
	}
	
}
