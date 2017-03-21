package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vikas on 10/9/16.
 */
public class HeightOfBinaryTreeLevelOrder {

    public int heightBinaryTree(BinaryTreeNode root) {

        if(root == null)
            return -1;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.offer(root);
        q.offer(null);
        int height = 1;

        while(! q.isEmpty()) {

            BinaryTreeNode curr = q.poll();

            if(curr != null) {

                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            else {
                if(! q.isEmpty()) {
                    height++;
                    q.offer(null);
                }
            }
        }
        return height;
    }
}
