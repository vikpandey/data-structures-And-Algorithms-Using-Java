package linkedList;

public class MyLinkedList {
	/*
public static ListNode addNodeEnd(ListNode head, int data) {

	    ListNode ln = new ListNode(data);
		
	    if(head == null) {
	    	
	    	head = ln;
	    	return head;
	    }
	    else
	    {
	    	ListNode current = head;
	    	while(current.next != null) {
	    		
	    		current = current.getNext();
	   
	    	}
	    	current.next = ln;
	    	return head;
	    }		
	
	}

    public static ListNode addNodeStart(ListNode head, int data) {
    	
    	ListNode ln = new ListNode(data);
    	
    	if(head == null) {
    		
    		head = ln;
    		return head;
    	}
    	
    	else {
    		
    		ln.next = head;
    		head = ln;
    		return head;
    	}
    }
    
    public static ListNode addNodeLoc (ListNode head, int loc, int data) {
    	
    	ListNode ln = new ListNode(data);
    	
    	if(head == null) {
    		
    		head = ln;
    		return head;
    	}
    	else if(loc == 0) {
    		
    	return addNodeStart(head,data);
    	}
    	else {
    		
    		ListNode current = head;
    		while(loc-1 != 0) {
    			
    			current = current.next;
    			loc--;
    		}
    		ln.next = current.next;
    		current.next = ln;
    		return head;
    	}
    }

    public static void printNode(ListNode head) {
    	
    	while(head != null) {
    		System.out.println(head.getData());
    		head = head.next;
    	}
    }
    */

    public static ListNode deleteNodeEnd(ListNode head, int loc) {
    	
    	ListNode previousNode = head;
    	int count = 1;
    	while(count < loc) {
    		
    		previousNode = previousNode.getNext();
    		count++;
    	}
    	
    	ListNode current = previousNode.getNext();
    	previousNode.setNext(current.getNext());
    	current = null;
    	return head;
    }
    
    public static ListNode deleteLinkedList(ListNode head) {
    	
    	ListNode aux, iterator = head;
    	
    	while(iterator != null) {
    		
    		aux = iterator.getNext();
    		iterator = null;
    		iterator = aux;
    	}
    	return head;
    }
    
    /**
    
    public void findNthNodeFromEnd(ListNode head, int n) {
    	
    	int length = 0;
    	ListNode currentNode = head;
    	
    	while(head != null) {
    		length++;
    		currentNode = currentNode.getNext();
    	}
    	
    	traverseNthNode(head, length, n);
    }
    
    public void traverseNthNode(ListNode head, int length, int n) {
    	
        ListNode currentNode = head;
        
        while(length-n+1 < )
        
    }
    
    
    */
    
    
/*
	public static void main(String[] args) {
		
		ListNode head = new ListNode(4);
		
		System.out.println("Original");
		printNode(head);
		
		
		head = addNodeStart(head,3);
		System.out.println("Add 3 in start");
		printNode(head);
		
		head = addNodeStart(head,2);
		System.out.println("Add 2 in start");
		printNode(head);
		
		head = addNodeEnd(head,6);
		System.out.println("Add 6 in end");
		printNode(head);
		
		head = addNodeLoc(head, 3, 5);
		System.out.println("add 5 at 3");
		printNode(head);
		
		head = deleteNodeEnd(head, 3);
		System.out.println("delete");
		printNode(head);
		
		System.out.println("deleting the entire linked list");
		head = deleteLinkedList(head);
		printNode(head);

	}
	*/

}
