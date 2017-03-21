package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {
	
	public int sizeBinaryTree(BinaryTreeNode root, int data) {
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		q.offer(root);
		int count = 0;
		
		while(! q.isEmpty()){
			
			BinaryTreeNode tmp = q.poll();
			count++;
			
			if(tmp.left != null) 
				q.offer(tmp.left);
			if(tmp.right != null)
				q.offer(tmp.right);
			
		}
		
		return count;
	}

}
