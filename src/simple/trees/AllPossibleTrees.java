package simple.trees;

import java.util.LinkedList;
import java.util.List;

public class AllPossibleTrees {

	static List<Node> allPossible(int[] preorder, int start, int end) {
		List<Node> returnTrees = new LinkedList<Node>();
		if(start>end || start<0 || end>=preorder.length) {
			returnTrees.add(null);
			return returnTrees;
		}
		if(start == end) {
			returnTrees.add(new Node(preorder[start]));
			return returnTrees;
		}
		
		for(int i = -1;i<end-start;i++) {
			List<Node> leftTrees = allPossible(preorder, start+1,start+1+i);
			List<Node> rightTrees = allPossible(preorder, start+1+i+1, end);
			
			for(Node left:leftTrees) {
				for(Node right:rightTrees) {
					Node temp = new Node(preorder[start]);
					temp.left = left;
					temp.right = right;
					returnTrees.add(temp);
				}
			}
		}
		return returnTrees;
	}
	
	static void inorder(Node root) {
		if(root == null) return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void main(String[] args) {
		int a[]={1, 2, 3};
		
		for(Node node:allPossible(a, 0, a.length-1)) {
			inorder(node);
			System.out.println();
		}
	}
}
