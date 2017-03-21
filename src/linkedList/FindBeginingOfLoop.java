package linkedList;

/**
 * 
 * @author vikas
 * 
 * In this Program I am trying to find the begining of the loop, if there is a
 * loop in a linkedlist. To find the loop, keep two pointers, i.e. fastPtr and 
 * slowPtr. Move fastPtr two nodes at a time and slowPtr one node at a time, and 
 * if they become equal, then there is a loop. Once we figured out the loop, then
 * initialize the slowPtr to the head node and then move slowPtr and fastPtr, 1 node
 * at a time, till both collide with each other. When then collide, then return
 * the fastPtr. 
 *
 */

public class FindBeginingOfLoop {
	
	public static ListNode findBeginOfLoop(ListNode head) {
		if(head == null) 
			return null;
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		boolean loopExist = false;
		
		while(fastPtr != null && fastPtr.getNext() != null) {
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			if(slowPtr == fastPtr) {
				loopExist = true;
				break;
			}
		}
		if(loopExist == true) {
			slowPtr = head;
			while(slowPtr != fastPtr) {
				slowPtr = slowPtr.getNext();
				fastPtr = fastPtr.getNext();
			}
			return fastPtr;
		}
		else 
			return null;
	}

}
