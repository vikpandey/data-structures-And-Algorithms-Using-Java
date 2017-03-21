package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumElementInBinaryTree {
	
	int maxValue = Integer.MIN_VALUE;
	
	public int maxInBinaryTree(BinaryTreeNode root) {
		
		if(root != null) {
			
			int leftMax = maxInBinaryTree(root.left);
			int rightMax = maxInBinaryTree(root.right);
			
			if(leftMax > rightMax)
				maxValue = leftMax;
			else
				maxValue = rightMax;
			
			if(root.data > maxValue)
				maxValue = root.data;
		}
		return maxValue;
	}
	
	public int maxInBinaryTreeLevelOrder(BinaryTreeNode root) {
		
		if (root == null) 
			return Integer.MIN_VALUE;
		
		int maxValue = Integer.MIN_VALUE;
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		
		q.offer(root);
		
		while(!q.isEmpty()) {
			
			BinaryTreeNode tmp = q.poll();
			if(tmp.data > maxValue) {
				maxValue = tmp.data;
			}
			if(tmp.left != null)
				q.offer(tmp.left);
			if(tmp.right != null)
				q.offer(tmp.right);
		}
		
		return maxValue;
		
	}
}
