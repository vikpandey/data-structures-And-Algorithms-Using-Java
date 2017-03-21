package tree.binaryTree;

/**
 * Created by vikas on 10/10/16.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 *  Full nodes are nodes which has both left and right subtree.
 *  We can do it using level-Order traversal. Check, if the current node's left and right subtree are not null. If this
 *  is true, the increase the counter.
 */
public class CountingFullNodesInBinaryTree {

    public int countFullNodes(BinaryTreeNode root) {
        int count = 0;

        if (root == null)
            return  0;

        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);

        while (! q.isEmpty()) {

            BinaryTreeNode currentNode = q.poll();

            if(currentNode != null) {
                if(currentNode.left != null && currentNode.right != null) {
                    count++;
                }
                if(currentNode.left != null) {
                    q.offer(currentNode.left);
                }
                if(currentNode.right != null) {
                    q.offer(currentNode.right);
                }
            }
        }
        return count;
    }
}
