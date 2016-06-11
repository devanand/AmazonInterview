package simple.trees;


public class NodesWithoutSiblings {

	static void nodesWithoutSiblings(Node root) {
		if (root == null) return;
		
		if(root.left == null && root.right != null) 
			System.out.println(root.right.data);
		if(root.left != null && root.right == null) 
			System.out.println(root.left.data);
		
		nodesWithoutSiblings(root.left);
		nodesWithoutSiblings(root.right);
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.left.right = new Node(6);
		nodesWithoutSiblings(root);
	}
}
