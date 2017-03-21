package queue;

import stack.StackLinkedList;

public class QueueReversal {
	
	public static LinkedQueue queueReverse(LinkedQueue queue) throws Exception {
		
		StackLinkedList stack = new StackLinkedList(); 
		if(!queue.isEmpty()) {
			stack.push(queue.dequeue());
		}
		while(!stack.isEmpty()) {
			queue.enqueue(stack.pop());
		}
		
		return queue;
	}

}
