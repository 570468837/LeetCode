package Q095_Q110;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Common.TreeNode;

public class Q102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null)
			return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        queue.offer(root);
        while(!queue.isEmpty()){
        	int levelNum = queue.size();
        	List<Integer> sub = new ArrayList<>();
        	for(int i=0; i<levelNum; i++){
        		TreeNode node = queue.poll();
        		if(node.left != null) queue.offer(node.left);
        		if(node.right != null) queue.offer(node.right);
        		sub.add(node.val);
        	}
        	res.add(sub);
        }
		return res;
    }
}
