package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {
	
	public static void levelOrderTraversalReverse(BinaryTreeNode root) {
		
		if (root == null)
			return;
		
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		
		q.offer(root);
		while(! q.isEmpty()) {
			
			BinaryTreeNode tmp = q.poll();
			
			if(tmp.left != null)
				q.offer(tmp.left);
			if(tmp.right != null)
				q.offer(tmp.right);
			s.push(tmp);
		}
		while(!s.isEmpty()) {
			System.out.println(s.pop().getData()+ ", ");
		}
	}
}
