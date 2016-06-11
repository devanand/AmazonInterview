package simple.trees;

public class IsBalancedTree {

	public static int maxLevel(Node node) {
		if(node == null) return 0;
		int left = maxLevel(node.left);
		int right = maxLevel(node.right);
		return Math.max(left, right)+1;
	}
	
	public static boolean isBalancedNaive(Node root) {
		if(root == null) return true;
		
		int left = maxLevel(root.left);
		int right = maxLevel(root.right);
		
		return Math.abs(left-right)<=1?isBalancedNaive(root.left) && isBalancedNaive(root.right):false;
		
	}
	
	public static int isBalanced(Node root) {
		if(root == null ) return 0;
		int left = isBalanced(root.left);
		int right = isBalanced(root.right);
 
		if (left == -1 || right == -1)
			return -1;
 
		if (Math.abs(left - right) > 1) {
			return -1;
		}
 
		return Math.max(left, right) + 1;
	}
	
}
