package linkedList;

/**
 * 
 * @author vikas
 * Here I'm trying to find out how can we detect loop in a linkedlist.
 *
 */

public class DetectLoopinLinkedList {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(4);
		ListNode next = new ListNode(5);
		head.setNext(next);
		detectLoop(head);
	
	}
	
	public static boolean detectLoop(ListNode head) {
		
		if(head == null) 
			return false;
		ListNode fastPointer = head;
		ListNode slowPointer = head;
		
		while(slowPointer != null && fastPointer != null && fastPointer.getNext() != null) {
			
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext();
			fastPointer = fastPointer.getNext();
			
			if(fastPointer == slowPointer){
				return true;
			}
		}
		return false;	
	}
}
