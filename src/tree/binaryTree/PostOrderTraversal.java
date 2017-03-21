package tree.binaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
	
	public void postOrder(BinaryTreeNode root) {
		
		if(root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);
		}
	}
	
	public ArrayList<Integer> postOrderTraversalIterative(BinaryTreeNode root) {
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		if(root == null)
			return res;
		
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);
		BinaryTreeNode previous = null;
		
		while(!s.isEmpty()) {
			
			BinaryTreeNode current = s.peek();
			if(previous == null || previous.left == current || previous.right == current) {
				
				if(current.left != null)
					s.push(current.left);
				else if(current.right != null)
					s.push(current.right);
			}
			else if(current.left == previous) {
				if(current.right != null)
					s.push(current.right);
			} else {
				res.add(current.data);
				s.pop();
			}
			previous = current;
		}
		
		return res;
		
	}

}
