package leetCode.conest.June;

public class InvertBinaryTree {

	/**
	 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
	 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
	 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
	 * = left; this.right = right; } }
	 */

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(4);
		
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		root.right = new TreeNode(7);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
	
		printTree(root);
		
		TreeNode invertRoot = invertTree(root);
		System.out.println("--------------");
		printTree(invertRoot);
	}
	
	private static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
            
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        
        return root;
    }

	private static void printTree(TreeNode root) {
		if(root == null) return;
		int l = root.left!=null ? root.left.val : 0;
		int r = root.right!=null ? root.right.val : 0;
		System.out.println("Node: "+root.val+" -> "+l+" | "+r);
		printTree(root.left);
		printTree(root.right);
	}
}
