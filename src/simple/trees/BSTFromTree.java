package simple.trees;

public class BSTFromTree {

	static MinMax bstFromTree(Node root) {
		if(root == null) {
			return new MinMax();
		}
		
		MinMax left = bstFromTree(root.left);
		MinMax right = bstFromTree(root.right);
		
		MinMax m = new MinMax();
		
		if(!left.isBst || !right.isBst || left.max>root.data || right.min<=root.data) {
			m.isBst = true;
			m.size = Math.max(left.size, right.size);
			return m;
		}
		
		m.isBst = true;
		m.min = root.left != null ? left.min:root.data;
		m.max = root.left != null ? right.max:root.data;
		m.size = left.size+right.size;
		return m;
	}
	
}

class MinMax {
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	boolean isBst = true;
	int size;
}