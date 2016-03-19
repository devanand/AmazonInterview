package simple.trees;


public class IsBalancedTree {

	static int height(Node root) {
		if(root == null) return 0;
		
		return(Math.max(height(root.left), height(root.right)))+1;
	}
	
	static boolean isBalanced(Node root) {
		if(root == null) return true;
		
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int diff = leftHeight>rightHeight?leftHeight-rightHeight:rightHeight-leftHeight;
		if(diff<=1) {
			return (isBalanced(root.left) && isBalanced(root.right));
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		//root.right = new Node(3);
		root.left.left = new Node(4);
		
		System.out.println(isBalanced(root));
	}
}

