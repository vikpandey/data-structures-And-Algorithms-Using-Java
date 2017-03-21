package tree.binaryTree;

/**
 * Created by vikas on 10/10/16.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 *  Traverse the tree using level-order traversal. If the current node is not null and left and right of the current
 *  node is not null and the left and right of the current node is null then that's a leaf and increment the counter by
 *  1.
 */

public class CountingLeavesInBinaryTree {

    public int countLeaves(BinaryTreeNode root) {
        int count = 0;

        if (root == null)
            return 0;

        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);

        while( ! q.isEmpty()) {

            BinaryTreeNode currentNode = q.poll();

            if (currentNode != null) {
                if(currentNode.left == null && currentNode.right == null) {
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
        return  count;
    }
}
