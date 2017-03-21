package tree.binaryTree;

import java.util.Stack;

/**
 * Created by vikas on 9/30/16.
 *
 * In this code, I have tried to find the height of the binary tree using Post-Order Traversal
 */
public class HeightOfBinaryTree {

    public int heightBinaryTree(BinaryTreeNode root) {

        if(root == null)
            return 0;
        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);
        int maxDepth = 0;
        BinaryTreeNode prev = null;

        while(! s.isEmpty()) {
            BinaryTreeNode curr = s.peek();

            if(prev == null || prev == curr.left || prev == curr.right) {

                if(curr.left != null) {
                    s.push(curr.left);
                }
                else if(curr.right != null) {
                    s.push(curr.right);
                }
            }
            else if(curr.left == prev) {
                if(curr.right != null) {
                    s.push(curr.right);
                }
            }
            else {
                s.pop();
            }
            if(s.size() > maxDepth) {
                maxDepth = s.size();
            }
        }
        return  maxDepth;
    }
}
