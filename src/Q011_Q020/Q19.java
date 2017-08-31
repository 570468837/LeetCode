package Q011_Q020;

import java.util.HashMap;

import Q011_Q020.Q19.ListNode;

public class Q19 {
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		void print(){
			ListNode cur = this;
			while (cur != null){System.out.println(cur.val+" "); cur = cur.next;}
		}
	}
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int i = 0;
		ListNode cur = head;
		HashMap<Integer, ListNode> map = new HashMap<Integer, ListNode>();
		while(cur != null){
			map.put(i, cur);
			cur = cur.next;
			i++;	
		}
		i -= n;
		
		if(i == 0)
			return map.get(1);
		else
			map.get(i-1).next = map.get(i+1);
        return head;
    }
	
	public static void main(String[] args) {
		Q19 q = new Q19();
		
	}
}
