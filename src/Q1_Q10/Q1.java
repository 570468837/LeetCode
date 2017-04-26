package Q1_Q10;

import java.util.HashMap;
import java.util.Map;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Q1 q = new Q1();
			int[] nums = {3,3};
			int[] result = q.twoSum(nums, 6);
			for(int i=0; i<result.length; i++)
				System.out.println(result[i]);
	}

	//good
	public int[] twoSum(int[] numbers, int target) {
	    int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i);
	    }
	    return result;
	}
	
	//self-bad
	public int[] twoSum2(int[] nums, int target){
		int[] result = new int[2];
		int[] index = new int[2];
		HashMap map = new HashMap();
		for(int i=0; i<nums.length; i++){
			map.put(i, nums[i]);
		}
		
		for(int i=0; i<nums.length; i++){
			map.remove(i);
			if(map.containsValue(target-nums[i])){
				//stores the number;
				result[0] = nums[i];
				result[1] = target-nums[i];
				break;
			}
			map.put(i, nums[i]);
		}
		
		boolean visited1 = false;
		for(int i=0; i<nums.length; i++){
			if(result[0] == nums[i] && !visited1){
				index[0] = i;
				visited1 = true;
				continue;
			}
			if(result[1] == nums[i]){
				index[1] = i;
				break;
			}
		}
		
		return index;
	}
}
