package tree.binaryTree;

import java.util.ArrayList;
import java.util.Stack;



public class PreOrderTraversal {
	
	public void preOrder(BinaryTreeNode root) {
		
		if(root != null) {
			System.out.println(root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public ArrayList<Integer> preOrderTraversalIterative(BinaryTreeNode root) {
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		if(root == null)
			return res;
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		s.push(root);
		
		while(!s.isEmpty()) {
			
			BinaryTreeNode tmp = s.pop();
			res.add(tmp.data);
			
			if(tmp.right != null) {
				s.push(tmp.right);
			}
			if(tmp.left != null) {
				s.push(tmp.left);
			}
		}
		return res;
	}

}
