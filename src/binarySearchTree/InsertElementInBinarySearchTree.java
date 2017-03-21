package binarySearchTree;

/**
 * 
 * @author vikas
 * 
 * In this code, I will solve the problem of inserting Elements in a Binary search
 * tree. 
 *
 */

public class InsertElementInBinarySearchTree {
	
	/**
	 *  recursive method has a worst case time complexity of O(n) and space complexity
	 *  of O(n).
	 */
	
	public static BinarySearchTreeNode insertRecursive(BinarySearchTreeNode root, int data) {
		
		if(root == null) {
			root = new BinarySearchTreeNode();
			if(root == null) {
				System.out.println("Error");
				return null;
			}
			else {
				root.setData(data);
				root.setLeft(null);
				root.setRight(null);
			}
		}
		else {
			if(data < root.getData()) {
				root.setLeft(insertRecursive(root.getLeft(), data));
			}
			else if(data > root.getData()) {
				root.setRight(insertRecursive(root.getRight(), data));
			}
		}
		return root;
	}
	
	/**
	 * Iterative method has a worst case time complexity of O(n) and 
	 * space complexity of O(1).
	 */
	
	public static BinarySearchTreeNode insertIterative(BinarySearchTreeNode root,
			int data) {
		
		if(root == null) {
			root = new BinarySearchTreeNode();
			root.setData(data);
			root.setLeft(null);
			root.setRight(null);
		}
		while (root != null) {
			
			if(data == root.getData()) {
				break;
			}
			else if(root == null) {
				root = new BinarySearchTreeNode();
				root.setData(data);
				root.setLeft(null);
				root.setRight(null);
			}
			else if(data < root.getData()) {
				root = root.getLeft();
			}
			else if(data > root.getData()) {
				root = root.getRight();
			}
		}
		return root;
	}
}
