package queue;

import linkedList.ListNode;

public class MainLinkedQueue {

	public static void main(String[] args) throws Exception {
		
		LinkedQueue lq = new LinkedQueue();
		
		System.out.println("print the length of empty queue:- "+ lq.length);
		
		lq.enqueue(32);
		lq.enqueue(44);
		lq.enqueue(66);
		lq.dequeue();
		
		System.out.println("print the first element in the queue:- ");
		System.out.print(lq.first());
		
		

	}

}
