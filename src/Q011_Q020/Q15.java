package Q011_Q020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q15 {
	public static void main(String[] args){
		int[] nums = {0,0,0};
		List<List<Integer>> result = new Q15().threeSum(nums);
		for(List<Integer> l: result){
			for(Integer i: l){
				System.out.print(i+" ");
			}
			System.out.print("\n");
		}
		
	}
	
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		if(nums.length<3)
			return res;
		
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++){
        	if(i>0 && nums[i]==nums[i-1])
        		continue;
        	int sum = 0 - nums[i];
        	int lo = i+1; int hi = nums.length-1;
        	while(lo < hi){
        		
        		if(nums[lo] + nums[hi] < sum){
        			lo++;
        			
        		}
        		else if(nums[lo] + nums[hi] > sum){
        			hi--;
        		}
        	//nums[lo] + nums[hi] = sum
        		else {
        			res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
        			while( lo < hi && nums[lo+1] == nums[lo]) lo++; 
        			while(lo < hi && nums[hi] == nums[hi-1]) hi--;
        			lo++; 
        			hi--;
        		}
        	}
        }
        
		return res;
    }
	

}
