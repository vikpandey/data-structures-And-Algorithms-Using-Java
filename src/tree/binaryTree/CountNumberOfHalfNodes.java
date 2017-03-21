package tree.binaryTree;

/**
 * Created by vikas on 10/10/16.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 *  Half nodes are nodes, which has only one subtree and the other subtree is null.
 *  We can solve this problem by using level-order-traversal.
 *  Check for current node's left if its not null && current node's right if its null and then do a OR operation
 *  and check if the current node's left is null && current node's right is not null. then increment the counter.
 */

public class CountNumberOfHalfNodes {

    public int countHalfNodes(BinaryTreeNode root) {
        int count = 0;
        if (root == null)
            return  0;

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);

        while (! q.isEmpty()) {

            BinaryTreeNode currentNode = q.poll();

            while (currentNode != null) {

                if((currentNode.left != null && currentNode.right == null) || (currentNode.left == null && currentNode.right != null) ) {
                    count++;
                }
                if(currentNode.left != null)
                    q.offer(currentNode.left);
                if(currentNode.right != null)
                    q.offer(currentNode.right);
            }
        }
        return count;
    }
}
