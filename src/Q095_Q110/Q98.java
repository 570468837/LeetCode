package Q095_Q110;

import Common.TreeNode;

public class Q98 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String root = "[0]";
		System.out.println(new Q98().isValidBST(TreeNode.stringToTreeNode(root)));
	}
	
	public boolean isValidBST(TreeNode root) {
        
		
		return isValid(root, Double.MIN_VALUE, Double.MAX_VALUE);
    }

	public boolean isValid(TreeNode root, double minValue, double maxValue){
		if(root == null)
			return true;
		if(root.val >= maxValue || root.val <= minValue)
			return false;
		return isValid(root.left, minValue, root.val) 
				&& isValid(root.right, root.val, maxValue);
		
	}
}
