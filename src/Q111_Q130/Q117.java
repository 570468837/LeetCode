package Q111_Q130;

import Common.TreeLinkNode;

public class Q117 {
	public static void main(String[] args) {
		TreeLinkNode root = new TreeLinkNode(1);
		root.left = new TreeLinkNode(2);
		root.right = new TreeLinkNode(3);
		root.left.right = new TreeLinkNode(4);
		root.right.right = new TreeLinkNode(5);
		new Q117().connect(root);
	}
	
	public void connect(TreeLinkNode root) {
        TreeLinkNode dummyHead = new TreeLinkNode(0);
        TreeLinkNode pre = dummyHead;
        while (root != null) {
	    if (root.left != null) {
		    pre.next = root.left;
		    pre = pre.next;
	    }
	    if (root.right != null) {
		    pre.next = root.right;
		    pre = pre.next;
	    }
	    root = root.next;
	    if (root == null) {
		    pre = dummyHead;
		    root = dummyHead.next;
		    dummyHead.next = null;
	    }
    }
    }
}
