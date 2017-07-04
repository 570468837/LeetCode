package Q21_Q30;

public class Q27 {

	public static void main(String[] args) {
		Q27 q = new Q27();
		int nums[] = {1,2,3,4,4,4,3,3,3};
		System.out.println(q.removeElement(nums, 3));
	}
	
	public int removeElement(int[] nums, int val) {
		int count = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i] == val)
				count++;
			else
				nums[i-count] = nums[i];
		}
		
		return nums.length-count;
        
    }
}
