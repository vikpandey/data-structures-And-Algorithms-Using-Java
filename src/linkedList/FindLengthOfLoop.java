package linkedList;

public class FindLengthOfLoop {
	
	public static int lengthOfLoop(ListNode head) {
		if(head == null)
			return -1;
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
		int length = 0;
		slowPtr = slowPtr.getNext();
		length++;
		if(loopExist) {
			while(slowPtr != fastPtr) {
				slowPtr = slowPtr.getNext();
				length++;
			}
		}
		return length;
	}

}
