package tree.binaryTree;

import java.util.Stack;

public class DeleteBinaryTree {
	
	public BinaryTreeNode deleteTree(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);
		
		BinaryTreeNode previous = null;
		
		while(! s.isEmpty()) {
			
			BinaryTreeNode current = s.peek();
			
			if(previous == null || previous.left == current || previous.right == current) {
				
				if (current.left != null)
					s.push(current.left);
				else if (current.right != null)
					s.push(current.right);
			}
			else if (current.left == previous) {
				if (current.right != null)
					s.push(current.right);
			} 
			else {
				current.data = (Integer) null;
				s.pop();
			}
			previous = current; 
		}
		
		return root;
	}
}
