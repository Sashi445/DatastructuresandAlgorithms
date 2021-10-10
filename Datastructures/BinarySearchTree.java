class TreeNode{

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

public class BinarySearchTree {

	TreeNode root;

	public BinarySearchTree(){
		this.root = null;
	}

	private TreeNode insertVal(TreeNode root, int value){

		if (root == null){

			return new TreeNode(value);
		
		}

		else { 

			if (value > root.value) {

				root.right = insertVal(root.right, value);

			} 

			else {

				root.left = insertVal(root.left, value);
			}

		}


		return root;

	}

	public void insert(int value){
		this.root = insertVal(this.root, value);
	}

	public void delete(){}

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(10);
		bst.insert(7);
		bst.insert(11);

		bst.root.inorderTraversal(bst.root);

	}

}
