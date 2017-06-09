package Common;

public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) { val = x; }
	
	public ListNode (int[] vals){
		this.val = vals[0];
		ListNode temp = this;
		for(int i=1; i<vals.length; i++){
			temp.next = new ListNode(vals[i]);
			temp = temp.next;
		}
	}
	
	public void print(){
		ListNode cur = this;
		while (cur != null) {System.out.print(cur.val+" "); cur = cur.next;}
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		ListNode head = new ListNode(nums);
		head.print();
	}

	
}
