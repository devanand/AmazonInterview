package simple.trees;

import java.util.Collections;
import java.util.logging.Logger;

public class LeastCommonAncestor {

	static Node  leastCommonAncestor(Node root, int n1, int n2) {
		if(root == null) return null;
		
		if(root.data == n1 || root.data == n2) {
			return root;
		}
		
		Node left = leastCommonAncestor(root.left, n1, n2);
		Node right = leastCommonAncestor(root.right, n1, n2);
		
		if(left != null && right != null) {
			return root;
		}
		
		return left!=null?left:right;
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(3);
	
		
		root.right = new Node(2);
		root.left.left = new Node(5);
		root.right.right = new Node(7);
		root.right.left = new Node(6);
		root.left.right = new Node(4);
		
		System.out.println(leastCommonAncestor(root, 2, 3));
		
	}
}
