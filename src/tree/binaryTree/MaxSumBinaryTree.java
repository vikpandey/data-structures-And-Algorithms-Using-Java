package tree.binaryTree;

/**
 * Created by vikas on 10/19/16.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 *  Maximum sum of binary tree will give us information about, which level has maximum value of the sum of all nodes in
 *  that level and also gives the sum.
 */


public class MaxSumBinaryTree {

    public static void maxSumBinaryTree(BinaryTreeNode root) {

        if(root == null)
            System.out.println("Root is null!!!");

        int maxSum = 0;
        int sum = 0;
        int maxLevel = 0;
        int level = 0;

        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        maxSum = root.getData();
        if(root.left == null && root.right == null)
            System.out.println("Maximum value is: " + root.getData());
            System.out.println("Level where we got Maximum sum is: " + maxLevel);

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
                level++;
                if(! q.isEmpty()) {
                    if(maxSum < sum){
                        maxSum = sum;
                        maxLevel = level;
                    }
                    sum = 0;
                    q.offer(null);
                }
            }
        }
        System.out.println("maximum value of sum of all nodes of a level is: " + maxSum);
        System.out.println("level of tree where max value of sum of all nodes is found: " + maxLevel);
    }


}
