package simple.trees;

class Node {

	public Node left;
	public int data;
	public Node right;

	public Node(int data) {
		this.data = data;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data+"";
	}
}
