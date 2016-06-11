package simple.trees;

import java.util.Collections;

public class SortedArrayToBST {

	static Node toBst(int a[], int start, int end) {
		if(start>end) {
			return null;
		}
		int middle = start +(end-start)/2;
		Node node = new Node(a[middle]);
		
		node.left = toBst(a, start,middle-1);
		node.right = toBst(a, middle+1, end);
		return node;
		
	}
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3};
		Node root = toBst(a, 0, a.length-1);
		
		Util.printTree(Collections.singletonList(root), 0, 3);
	}
}
