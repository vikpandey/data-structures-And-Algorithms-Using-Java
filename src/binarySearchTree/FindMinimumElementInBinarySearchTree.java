package binarySearchTree;

/**
 * 
 * @author vikas
 * 
 * In this code, I am trying to find the minimum element in a binary search
 * tree. We can easily find it, since it will be the left most element, without 
 * a child node. We can do it using recursive and iterative methods.
 *
 */

public class FindMinimumElementInBinarySearchTree {
	
	/**
	 * First try with recursive method. This method as time complexity of O(n) 
	 * in worst cast and space complexity of O(n).
	 */
	
	public static BinarySearchTreeNode findMinRecursive(BinarySearchTreeNode root) {
		if(root == null)
			return null;
		else if (root.getLeft() == null){
			return root;
		}
		else 
			return findMinRecursive(root.getLeft());
	}
	
	/**
	 *  Now Lets try solving the problem iteratively. In this case, time complexity
	 *  will be O(n) and space complexity will be O(1).
	 */
	
	public static BinarySearchTreeNode findMinIterative(BinarySearchTreeNode root) {
		if(root == null)
			return null;
		
		while(root != null) {
			if(root.getLeft() == null) {
				return root;
			}
			else {
				root = root.getLeft();
			}
		}
		return null;
	}
}
