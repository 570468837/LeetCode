package Q031_Q040;

import java.util.ArrayList;
import java.util.List;

public class Q39 {
	 public static void main(String[] args) {
		int candidates[] = {2,3,6,7};
		Q39 q = new Q39();
		q.combinationSum(candidates, 7);
	}
	 
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
				 tempList.add(candidates[i]);
				 backtrack(res, tempList, candidates, sum-candidates[i], i);
				 tempList.remove(tempList.size()-1);
			 }
		 }
	 }
}
