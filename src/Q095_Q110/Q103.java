package Q095_Q110;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Common.TreeNode;

public class Q103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		if(root == null)
			return new ArrayList<>();
		boolean forward = true;
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
        	if(forward)	res.add(sub);
        	else{Collections.reverse(sub);	res.add(sub);}
        	forward = !forward;
        }
		return res;
    }
}
