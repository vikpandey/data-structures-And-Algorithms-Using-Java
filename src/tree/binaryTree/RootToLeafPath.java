package tree.binaryTree;

import sun.reflect.generics.tree.Tree;

import java.util.Stack;

/**
 * Created by vikas on 10/23/16.
 */


public class RootToLeafPath {

    public void rootToLeaf(BinaryTreeNode root) {

        if(root == null)
            System.out.println("root is null");

        Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
        s.push(root);

        while(!s.isEmpty()) {

            BinaryTreeNode tmp = s.peek();
           ;

            if(tmp.left == null) {
                if (tmp.right != null) {
                    s.push(tmp.right);
                }
                if()
            }
            else {
                s.push(tmp.left);
            }
        }
    }
}


