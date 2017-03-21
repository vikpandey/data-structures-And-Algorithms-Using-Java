package tree.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	public ArrayList<ArrayList<Integer>> levelOrder(BinaryTreeNode root) {
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		if (root == null)
			return res;
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		q.offer(null);
		
		ArrayList<Integer> curr = new ArrayList<Integer>();
		while(!q.isEmpty()) {
			
			BinaryTreeNode tmp = q.poll(); 
			if (tmp != null) {
				curr.add(tmp.data);
				if (tmp.left != null) {
					q.offer(tmp.left);
				}
				if (tmp.right != null) {
					q.offer(tmp.right);
				}
			}
			
			else {
				ArrayList<Integer> c_curr = new ArrayList<Integer> (curr);
				res.add(c_curr);
				curr.clear();
				if (!q.isEmpty()) {
					q.offer(null);
				}	
			}
		}
		return res;
	}
}
