package tree.binaryTree;

/**
 * Created by vikas on 10/11/16.
 */






public class FindingDiameterOfTree {

    public int diameterOfTree(BinaryTreeNode root) {

        if(root == null)
            return 0;

        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldiameter = diameterOfTree(root.left);
        int rdiameter = diameterOfTree(root.right);

        return Math.max(lheight + rheight +1, Math.max(ldiameter, rdiameter));
    }

    public int height(BinaryTreeNode root) {

        if(root == null)
            return -1;

        return (1 + Math.max(height(root.left), height(root.right)));
    }
}
