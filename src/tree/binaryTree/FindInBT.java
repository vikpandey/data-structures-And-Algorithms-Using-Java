package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class FindInBT {
	
	public static boolean findInBTRecursive(BinaryTreeNode root, int data) {
		
		if(root == null)
			return false;
		if(root.data == data)
			return true;
		return findInBTRecursive(root.left, data) || findInBTRecursive(root.right, data);
	}
	
	public boolean findInBTIterative(BinaryTreeNode root, int data) {
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		
		q.offer(root);
		
		while(!q.isEmpty()) {
			
			BinaryTreeNode tmp = q.poll();
			if(tmp.data == data) 
				return true;
			else {
				if(tmp.left != null) 
					q.offer(tmp.left);
				if(tmp.right != null)
					q.offer(tmp.right);
			}
		}
		return false;
	}
}
