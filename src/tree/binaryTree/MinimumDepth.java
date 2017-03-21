package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vikas on 9/30/16.
 */
public class MinimumDepth {

    public int minDepth(BinaryTreeNode root) {

        if(root == null)
            return 0;

        int depth = 0;

        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        q.offer(null);

        while(! q.isEmpty()) {
            BinaryTreeNode currentNode = q.poll();
            if(currentNode != null) {
                if(currentNode.left == null && currentNode.right == null) {
                    return depth;
                }
             if(currentNode.left != null)
                 q.offer(currentNode.left);
             if(currentNode.right != null)
                 q.offer(currentNode.right);
            }
            else
            {
                if(! q.isEmpty()) {
                    depth++;
                    q.offer(null);
                }
            }

        }
        return depth;
    }
}


