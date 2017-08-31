package Q041_Q050;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q47 {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
	   if(tempList.size() == nums.length){
	      list.add(new ArrayList<>(tempList));
	   } else{
	      for(int i = 0; i < nums.length; i++){ 
	         if(i>=1 && nums[i] == nums[i-1]) continue;
	         tempList.add(nums[i]);
	         backtrack(list, tempList, nums);
	         tempList.remove(tempList.size() - 1);
	      }
	   }
	}
}

