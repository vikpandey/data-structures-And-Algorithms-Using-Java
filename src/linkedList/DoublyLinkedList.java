package linkedList;

public class DoublyLinkedList {
	
	int getDLLLength(DLLNode head) {
		
		int length = 0;
		DLLNode currentNode = head;
		while(currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		
		return length;
	}
	
	DLLNode DLLInsert(DLLNode head, DLLNode newNode, int position) {
		
		if(head == null) {
			
			return newNode;
		}
		
		int size = getDLLLength(head);
		
		if(position > size+1 || position < 1) {
			
			System.out.println("position invalid" + " the valid inputs are 1 to " + (size+1));
			return head;
		}
		
		if(position == 1) {   // in the beginning 
			
			newNode.setNext(head);
			newNode.setPrevious(null);
			head.setPrevious(newNode);
			return newNode;
			
		}
		else {              // inserting in the middle or in the end
			
			DLLNode previousNode = head;
			int count = 1;
			while(count < position -1) {
				
				previousNode = previousNode.getNext();
				count++;
			}
			
			DLLNode currentNode = previousNode.getNext();
			
			newNode.setNext(currentNode);
			if(currentNode != null) {
				
				currentNode.setPrevious(newNode);
			}
			
			previousNode.setNext(newNode);
			newNode.setPrevious(previousNode);
			
		}
		
		return head;
		
	}
	
	DLLNode dllDeleteEnd(DLLNode head) {
		
		/*int size = getDLLLength(head);
		
		if(position > size || position < 1) {
			
			System.out.println("invalid position");
		}
		
		if(position == 1) {
			
			DLLNode currentNode = head.getNext();
			head = null;
			currentNode.setPrevious(null);
			return currentNode;
		}
		*/
		
			DLLNode currentNode = head;
			while(currentNode.getNext() != null) {
				
				currentNode = currentNode.getNext();
			}
			DLLNode previous = currentNode.getPrevious();
			previous.setNext(null);
			currentNode = null;
			return head;
		}
	
	public DLLNode dllDeletemiddle(DLLNode head, int position) {
		
		DLLNode currentNode = head;
		int count = 0;
		while(count < position-1) {
			
			currentNode = currentNode.getNext();
			count++;
		}
		DLLNode previous = currentNode.getPrevious();
		DLLNode later = currentNode.getNext();
		previous.setNext(currentNode.getNext());
		later.setPrevious(previous);
		return head;
		
	}
	
	public static void printDLL(DLLNode head) {
		
		while(head != null) {
			
			System.out.println(head.getData());
			head = head.getNext();
		}
	}

	public static void main(String[] args) {
		
		DLLNode head = new DLLNode(4);
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		DLLNode newNode = new DLLNode(5);
		
		dll.DLLInsert(head, newNode, 2);
		
		newNode = new DLLNode(6);
		
		dll.DLLInsert(head, newNode, 3);
		
		newNode = new DLLNode(7);
		
		dll.DLLInsert(head, newNode, 4);
		
		newNode = new DLLNode(8);
		
		dll.DLLInsert(head, newNode, 5);
		
		DoublyLinkedList.printDLL(head);
		dll.dllDeleteEnd(head);
		System.out.println("before deleting /n ********");
		DoublyLinkedList.printDLL(head);
		System.out.println("deleting from middle /n **********");
		dll.dllDeletemiddle(head, 3);
		DoublyLinkedList.printDLL(head);
	
	}

}
