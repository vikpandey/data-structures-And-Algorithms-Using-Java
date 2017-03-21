package tree.binaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {
	
	public void inOrder(BinaryTreeNode root) {
		
		if(root != null) {
			inOrder(root.left);
			System.out.println(root.data);
			inOrder(root.right);
		}
	}
	
	public ArrayList<Integer> inOrderTraversalIterative(BinaryTreeNode root) {
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		BinaryTreeNode currentNode = root;
		Boolean done = false;
		
		while(!done) {
			if(currentNode != null) {
				s.push(currentNode);
				currentNode = currentNode.left;
			} else {
				if(s.isEmpty())
					done = true;
				else {
					currentNode = s.pop();
					res.add(currentNode.data);
					currentNode = currentNode.right;
				}
			}
		}
		return res;
	}

}
