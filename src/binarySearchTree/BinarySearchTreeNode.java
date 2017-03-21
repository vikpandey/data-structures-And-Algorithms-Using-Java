package binarySearchTree;

public class BinarySearchTreeNode {
	
	public int data;
	private BinarySearchTreeNode left;
	private BinarySearchTreeNode right;
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setLeft(BinarySearchTreeNode left) {
		this.left = left;
	}
	
	public BinarySearchTreeNode getLeft() {
		return left;
	}
	
	public void setRight(BinarySearchTreeNode right) {
		this.right = right;
	}
	
	public BinarySearchTreeNode getRight() {
		return right;
	}
	
}
