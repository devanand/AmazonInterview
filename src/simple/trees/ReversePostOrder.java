package simple.trees;

public class ReversePostOrder {

	static void arrayToPostOrder(int a[],Node root, int start, int end) {
		
		if(end<start) return;

		
		root.right = new Node(a[end]);
		int pivot = start+((end-start)/2);
		root.left = new Node(a[pivot]);
		
		arrayToPostOrder(a, root.left, start, pivot-1);
		arrayToPostOrder(a, root.right, pivot+1, end-1);
	}
	
	public static void main(String[] args) {
		int a[] = {8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1};
		Node root = new Node(a[a.length-1]);
		arrayToPostOrder(a, root, 0, a.length-2);
	}
}
