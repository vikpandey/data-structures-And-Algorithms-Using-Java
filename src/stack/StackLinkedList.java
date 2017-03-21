package stack;

import java.util.EmptyStackException;

import linkedList.ListNode;

public class StackLinkedList<T> {
	
	private int length;
	private ListNode top;
	
	public StackLinkedList() {
		
		length = 0;
		top = null;
	}
	
	public void push(int data) {
		
		ListNode temp = new ListNode(data);
		temp.setNext(top);
		top = temp;
		length++;
	}
	
	public int pop() throws EmptyStackException {
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		int result = top.getData();
		top = top.getNext();
		length--;
		return result;
	}
	
	public int peek() throws EmptyStackException {
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return top.getData();
	}
	
	public boolean isEmpty() {
		
		return top == null;
	}
	
	public int size() {
		
		return length;
	}
	
	public void readStack(ListNode top) {
		
		while(top != null) {
			
			System.out.print(top.getData() + " -> ");
		}
	}
	
	
	
	

}
