package tree.binaryTree;

/**
 * Created by vikas on 10/9/16.
 *
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 *  To find deepest node in the binary tree, I am using level-order traversal. The last node of level order traversal
 *  is the deepest node in the binary tree. Since we don't need to know if we traversed from one level to the next,
 *  so we don't need to put null after each level.
 */
public class DeepestNodeInBinaryTree {

    public BinaryTreeNode deepestBinaryTree(BinaryTreeNode root) {

        BinaryTreeNode tmp = null;
        if (root == null)
            return null;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);

        while (! q.isEmpty()) {

            tmp = q.poll();

            if(tmp != null) {
                if(tmp.left != null)
                    q.offer(tmp.left);
                if(tmp.right != null)
                    q.offer(tmp.right);
            }
        }

        return tmp;
    }
}
