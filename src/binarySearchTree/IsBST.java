package binarySearchTree;

public class IsBST {
	
	public static void main(String[] args) {
		
	 int min = Integer.MIN_VALUE;
	 int max = Integer.MAX_VALUE;
		
		BinarySearchTreeNode root = null;
		
		isBSTNode(root, min, max);
	}

	public static boolean isBSTNode(BinarySearchTreeNode root, int min, int max) {
		
		if(root == null) 
			return true;
		
		if(root.data < min || root.data > max) 
			return false;
		
		else
			return (isBSTNode(root.getLeft(), min, root.getData()-1) &&
					isBSTNode(root.getRight(), root.getData()+1, max));
	}

}
