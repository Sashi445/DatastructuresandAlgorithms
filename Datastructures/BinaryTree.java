import java.util.*;

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

public class BinaryTree{

	public static void main(String[] args){
		TreeNode t = new TreeNode(5);
		TreeNode t1 = new TreeNode(6);
		TreeNode t2 = new TreeNode(4);
		t.left = t2;
		t.right = t1;
		t.preorderTraversal(t);
		System.out.println("");
		t.postorderTraversal(t);
		System.out.println("");
		t.inorderTraversal(t);
	}

}