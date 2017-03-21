package binarySearchTree;

/**
 * 
 * @author vikas
 * 
 * In this code, I'm trying to Find the maximum element in a binary tree node. 
 * The right most node without any child node will be the maximum node in a 
 * binary search tree. I will solve it using recursive and iterative methods.
 *
 */

public class FindMaximumElementInBinarySearchTree {
	
	/**
	 * First I will solve it using recursive method. worst case time complexity is
	 * O(n) and space complexity is O(n).
	 */
	
	public static BinarySearchTreeNode findMaxRecursive(BinarySearchTreeNode root) {
		if(root == null)
			return null;
		if(root.getRight() == null)
			return root;
		else
			return findMaxRecursive(root.getRight());
	}
	
	/**
	 * Now lets solve it using Iterative method. Worst case time complexity is O(n)
	 * and space complexity is O(1).
	 */
	
	public static BinarySearchTreeNode findMaxIterative(BinarySearchTreeNode root) {
		if(root == null)
			return null;
		
		while(root != null) {
			if(root.getRight() == null) {
				return root;
			}
			else 
				root = root.getRight();
		}
		return null;
	}
}
