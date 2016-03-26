package simple.trees;

public class ReversePreOrder {

	public void insert(Node latestRoot, int data) {
		if(latestRoot == null) {
			latestRoot = new Node(data);
		}

		if(data<latestRoot.data) {
			if(latestRoot.left == null) {
				Node node = new Node(data);
				latestRoot.left = node;
			}
			else {
				insert(latestRoot.left, data);
			}
		} else {
			if(latestRoot.right == null) {
				Node node = new Node(data);
				latestRoot.right = node;
			}
			else {
				insert(latestRoot.right, data);
			}
		}
	}
}
