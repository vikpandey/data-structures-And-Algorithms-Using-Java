package tree.binaryTree;

/**
 * Created by vikas on 10/10/16.
 */

/**
 *  Structurally equal tree means, two trees have exactly same structure. for eg. two trees having same node as half node
 *  or two same nodes being full nodes etc.
 *  To determine if two nodes are structurally same, we need to do a recursive call and check if there is any similarity
 *  or not. Start with root & check if both the roots are null then its true, else recursively check for the left & right
 *  subtree of the tree and compare it with other tree's left & right subtree.
 */

public class StruturallyEqualTree {

    public boolean equals(BinaryTreeNode lhs, BinaryTreeNode rhs) {

        if (lhs == null && rhs == null)
            return  true;

        if ((lhs == null && rhs != null) || (lhs != null && rhs == null))
            return  false;

        return equals(lhs.getLeft() , rhs.getLeft()) && equals(lhs.getRight() , rhs.getRight());
    }
}
