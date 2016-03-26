package simple.trees;

import java.util.LinkedList;
import java.util.List;

public class PrintAllPaths {

	static void printAllPaths(Node root, List<Integer>l, int len) {
		if(root == null) return;
		
		l.add(len++, root.data);
		if(root.left == null && root.right == null) {
			for(int i=0;i<len;i++) {
				System.out.print(l.get(i)+" ");
			}
			System.out.println();
		}
		
		printAllPaths(root.left, l, len);
		printAllPaths(root.right, l, len);
	}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		List <Integer> l = new LinkedList<>();
		printAllPaths(root, l, 0);
		System.out.println(l);
	}
}
