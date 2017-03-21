package stack;

import linkedList.ListNode;

public class MainStackClass {

	public static void main(String[] args) {
		
		StackLinkedList sll = new StackLinkedList();
		
		sll.push(33);
		sll.push(22);
		sll.push(11);
		sll.push(44);
		System.out.println(sll.peek());
		System.out.println("size of stack is :- "+ sll.size());
		System.out.println("is stack empty :- " + sll.isEmpty());
		sll.pop();
		System.out.println("size of stack is :- " + sll.size());
		System.out.println(sll.peek());
		
		System.out.println("print all elements in the stack");
		
		
		
		
		

	}

}
