package binarySearchTree;

/**
 * 
 * @author vikas
 * 
 * In the code, I'm trying to find the element in a Binary search tree using
 * recursive and non-recursive methods.
 *
 */

public class FindElementInBinarySearchTree {
	
	/**
	 * First lets try with recursive method. In case of recursive method, 
	 * time complexity will be O(n) in case of worst case and 
	 * space complexity will be O(n)
	 */
	
	public BinarySearchTreeNode findRecursive(BinarySearchTreeNode root, int data) {
		
		if(root == null)
			return null;
		
		if(data < root.getData()) {
			return findRecursive(root.getLeft(), data);
		}
		else if(data > root.getData()) {
			return findRecursive(root.getRight(), data);
		}
		else
			return root;	
	}
	
	/**
	 *  Now lets try to find the element in a Binary Search Tree using non-recursive
	 *  method.
	 *  In case of non-recursive method, time complexity to search will be O(n) and
	 *  space complexity will be O(1).
	 */
	
	public BinarySearchTreeNode findNonRecursive(BinarySearchTreeNode root, int data) {
		
		if(root == null)
			return null;
		
		while(root != null) {
			if(data == root.getData()){
				return root;
			}
			else if(data < root.getData()) {
				root = root.getLeft();
			}
			else {
				root = root.getRight();
			}
		}
		return null;
		
	}
	

}
