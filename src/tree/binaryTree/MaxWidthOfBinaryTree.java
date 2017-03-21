package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vikas on 10/19/16.
 */
public class MaxWidthOfBinaryTree {

    public static int maxWidthBinaryTree(BinaryTreeNode root) {

        if(root == null)
            return -1;

        int count = 0, maxWidth = 0;

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        if(root.left == null && root.right == null)
            return 1;

        while (! q.isEmpty()) {

            BinaryTreeNode tmp = q.poll();

            if(tmp != null) {

                if(tmp.left != null) {
                    q.offer(tmp.left);
                    count++;
                }
                if(tmp.right != null) {
                    q.offer(tmp.right);
                    count++;
                }
            }
            else {
                if(! q.isEmpty()) {
                    if(maxWidth < count){

                        maxWidth = count;
                    }
                    count = 0;
                    q.offer(null);
                }
            }
        }
        return maxWidth;
    }


}
