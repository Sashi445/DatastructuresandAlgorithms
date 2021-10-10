public class TreeNode{

	int value;
	TreeNode left;
	TreeNode right;

	public TreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public void preorderTraversal(TreeNode root){
		
		// root -> left -> right
		// print == root left right

		if (root != null){
			System.out.printf(" %d ", root.value);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}

	}

	public void inorderTraversal(TreeNode root){

		/// print === left root right

		if (root != null){
			preorderTraversal(root.left);
			System.out.printf(" %d ", root.value);
			preorderTraversal(root.right);
		}

	}

	public void postorderTraversal(TreeNode root){

		// print === left right root

		if (root != null){
			preorderTraversal(root.left);
			preorderTraversal(root.right);
			System.out.printf(" %d ", root.value);
		}

	}

}