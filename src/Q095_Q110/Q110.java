package Q095_Q110;

import Common.TreeNode;

public class Q110 {
	public boolean isBalanced(TreeNode root) {
        return recursion(root);
    }

	public boolean recursion(TreeNode root){
		if(root == null)
			return true;
		if(root.left == null & root.right == null)
			return true;
		if(root.left == null && (root.right.left != null || root.right.right != null))
			return false;
		if(root.right == null && (root.left.left != null || root.left.right != null))
			return false;
		return recursion(root.left)&&recursion(root.right);
	}
}
