package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vikas on 10/9/16.
 */
public class MinimumDepthOfBinaryTree {

    public int minimumDepthBinaryTree(BinaryTreeNode root) {

        if(root == null)
            return -1;

        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        q.offer(null);
        int height = 1;

        while(! q.isEmpty()) {

            BinaryTreeNode currentNode = q.poll();

            if(currentNode != null) {

                if(currentNode.left == null && currentNode.right == null) {
                    return height;
                }
                if (currentNode.left != null) {
                    q.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.offer(currentNode.right);
                }
            }
            else {
                if (!q.isEmpty()) {
                    height++;
                    q.offer(null);
                }
            }
        }
        return  height;
    }
}
