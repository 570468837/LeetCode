package Q21_Q30;

import Common.ListNode;

public class Q23 {
	public ListNode mergeKLists(ListNode[] lists) {
		return partition(lists, 0, lists.length-1);
    }
	
	public ListNode partition(ListNode[] lists, int left, int right){
		if(left == right) return lists[left];
				
		if(left < right){
			int center = (left + right) / 2;
			ListNode l1 = partition(lists, left, center);
			ListNode l2 = partition(lists, center+1, right);
			return merge(l1, l2);
		}
		
		if(left > right) return null;
		
		return null;
	}

	public ListNode merge(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = merge(l1.next, l2);
			return l1;
		}
		else{
			l2.next = merge(l1, l2.next);
			return l2;
		}
	}
	
	public static void main(String[] args) {
		ListNode[] lists = new ListNode[2];
		int[] nums1 = {1};
		int[] nums2 = {0};
		ListNode head1 = new ListNode(nums1);
		ListNode head2 = new ListNode(nums2);
		lists[0] = head1;
		lists[1] = head2;
		Q23 q = new Q23();
		q.mergeKLists(lists).print();
	}
	
}
