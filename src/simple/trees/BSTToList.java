package simple.trees;

public class BSTToList {

	static void join(Node a, Node b) {
		a.right = b;
		b.left = a;
	}
	
	static Node append(Node a, Node b) {
		if(a==null) return b;
		if(b==null) return a;
		
		Node aLast = a.left;
		Node bLast = b.left;
		
		join(aLast, b);
		join(bLast, a);
		
		return a;
		
	}
	static Node bstToList(Node root) {
		if(root == null) {
			return null;
		}
		
		Node aList = bstToList(root.left);
		Node bList = bstToList(root.right);
		
		root.left = root;
		root.right = root;
		
		aList = append(aList, root);
		aList = append(aList, bList);
		return aList;
	}
	
	static void bst_To_Dll(Node root, Node last, Node head) {
		if(root == null) return;
		
		bst_To_Dll(root.left, last, head);
		
		if(last != null) {
			last.right = root;
		} else {
			head = root;
		}
		
		root.left = last;
		last = root;
	}
	
	public static void main(String[] args) {
		Node root = new Node(2);
		root.left = new Node(1);
		root.right = new Node(3);
		Node head = null;
		//bst_To_Dll(root, null, head);
		bstToList(root);
	}
}
