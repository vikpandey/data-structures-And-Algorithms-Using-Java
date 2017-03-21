package linkedList;

public class DLLNode {
	
	private int data1;
	private DLLNode next;
	private DLLNode previous;
	
	public DLLNode(int data1) {
		
		this.data1 = data1;
		this.next = null;
		this.previous = null;
	}
	
	public void setData(int data1) {
		
		this.data1 = data1;
	}
	
	public int getData() {
		
		return data1;
	}
	
	public void setNext(DLLNode next) {
		
		this.next = next;
	}
	
	public DLLNode getNext() {
		
		return next;
	}
	
	public void setPrevious(DLLNode previous) {
		
		this.previous = previous;
	}
	
	public DLLNode getPrevious() {
		
		return previous;
	}
	
}
