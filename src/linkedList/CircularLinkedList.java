package linkedList;

public class CircularLinkedList {
	
public int CircularListLength(CLLNode head) {
		
		int length = 0;
		CLLNode currentNode = head;
		while(currentNode != null) {
			
			length++;
			currentNode = currentNode.getNext();
			if(currentNode == head) {
				break;
			}
		}
		return length;
	}

public static void printCircularList(CLLNode head) {
	
	CLLNode currentNode = head;
	
	while(currentNode != null) {
		
		System.out.print(currentNode.getData() + " -> ");
		currentNode = currentNode.getNext();
		if(currentNode == head) {
			break;
		}
	}
	System.out.println("(" + currentNode.getData()+ ") head");
	
}

public static void insertAtEndInCLL(CLLNode head, CLLNode newNode) {
	
	CLLNode currentNode = head;
	newNode.setNext(newNode);
	while(currentNode.getNext() != head) {
		//currentNode.setNext(currentNode.getNext());
		currentNode.setNext(currentNode.getNext());
	}
	if(head == null) {
		head = newNode;
		
	}
	else {
		newNode.setNext(head);
		currentNode.setNext(newNode);
	}

}

    public static void insertAtBeginingCLL(CLLNode head, CLLNode newNode) {
    	
    	CLLNode currentNode = head;
    	
    	while(currentNode.getNext() != head) {
    		
    		currentNode.setNext(currentNode.getNext());
    	}
    	
    	newNode.setNext(newNode);
    	
    	if(head == null) {
    		
    		head = newNode;
    	}
    	else {
    		newNode.setNext(head);
    		currentNode.setNext(newNode);
    		head = newNode;
    	}
    }
    
    public static void deleteEndCLLNode(CLLNode head) {
    	
    	CLLNode previous = head;
    	CLLNode currentNode = head;
    	
    	if(head == null) {
    		System.out.println("empty list");
    		return;
    	}
    	while(currentNode.getNext() != head) {
    		
    		previous = currentNode;
    		currentNode = currentNode.getNext();
    	}
    	previous.setNext(head);
    	currentNode = null;
    	return;
    }
    
    public static void deleteFirstNode(CLLNode head) {
    	
    	CLLNode currentNode = head;
    	CLLNode nextNode = currentNode.getNext();
    	
    	if(head == null) {
    		System.out.println("empty list");
    		return;
    	}
    	
    	while(currentNode.getNext() != head) {
    		
    		currentNode = currentNode.getNext();
    	}
    	
    	currentNode.setNext(nextNode);
    	head = nextNode;
    	return;
    }
    

	public static void main(String[] args) {
		
		CLLNode head = new CLLNode(3);
		CircularLinkedList cll = new CircularLinkedList();
		
		CLLNode newNode = new CLLNode(4);
		
		cll.insertAtEndInCLL(head, newNode);
		cll.printCircularList(head);
		

	}

}
