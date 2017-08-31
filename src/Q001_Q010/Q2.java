package Q001_Q010;

public class Q2 {
	
	class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	ListNode produceList(int[] nums){
		ListNode res = new ListNode(nums[0]);
		ListNode pointer = res;
		for(int i=1; i<nums.length; i++){
			pointer.next = new ListNode(nums[i]);
			pointer = pointer.next;
		}
		return res;
	}
	
	public static void main(String[] args){
		Q2 q = new Q2();
		int[] num1 = {5,9,9};
		int[] num2 = {7};
		ListNode l1 = q.produceList(num1);
		ListNode l2 = q.produceList(num2);
		q.print(q.addTwoNumbers(l1, l2));
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//carrier
		int c = 0;
		ListNode header = new ListNode(0);
		ListNode cur = header;
		
		while(l1 != null || l2 != null){
			int sum = adder(l1 == null? 0:l1.val, l2 == null? 0:l2.val, c);
			cur.next = new ListNode(sum % 10);
			c = sum / 10;
			cur = cur.next;
			l1 = l1 == null? null:l1.next;
			l2 = l2 == null? null:l2.next;
		}
		if(c == 1)
			cur.next = new ListNode(1);
		
        return header.next;
        
    }
	
	int adder(int num1, int num2, int c){
		return num1+num2+c;
	}
	
	void print(ListNode node){
		while(node != null){
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println("");
	}
}
