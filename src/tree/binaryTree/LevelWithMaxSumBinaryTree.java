package tree.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vikas on 10/19/16.
 */

/**
 * We need to find which level has the maximum sum. To do it iteratively I have used Level-Order traversal.
 *
 */

public class LevelWithMaxSumBinaryTree {

    public int levelWithMaxSumBinaryTree(BinaryTreeNode root) {

        if(root == null)
            return -1;
        int level = 0;
        int maxLevel = 0;
        int sum = 0;
        int maxSum = 0;

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        if(root.left == null && root.right == null)
            return root.getData();

        while (! q.isEmpty()) {

            BinaryTreeNode tmp = q.poll();

            if(tmp != null) {

                if(tmp.left != null) {
                    q.offer(tmp.left);
                    sum += tmp.left.getData();
                }
                if(tmp.right != null) {
                    q.offer(tmp.right);
                    sum += tmp.right.getData();
                }
            }
            else {

                if(! q.isEmpty()) {
                    level++;
                    if(maxSum < sum) {
                        maxSum = sum;
                        maxLevel = level;
                    }
                    sum = 0;
                }
            }
        }
        return maxLevel;
    }
}
