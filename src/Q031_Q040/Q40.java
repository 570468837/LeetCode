package Q031_Q040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40 {
	 public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		 Arrays.sort(candidates);
		 List<List<Integer>> res = new ArrayList<>();
		 backtrack(res, new ArrayList<Integer>(), candidates, target, 0);
	     return res;
	 }
	 
	 public void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] candidates, 
			 int sum, int start){
		 if(sum < 0)
			 return;
		 else if(sum == 0)
			 res.add(new ArrayList<Integer>(tempList));
		 else{
			 for(int i=start ;i< candidates.length; i++){
				 if(i>start && candidates[i] == candidates[i-1]) 
					 continue;
				 tempList.add(candidates[i]);
				 backtrack(res, tempList, candidates, sum-candidates[i], i+1);
				 tempList.remove(tempList.size()-1);
			 }
		 }
	 }
}
