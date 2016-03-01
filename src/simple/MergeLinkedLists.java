package simple;



public class MergeLinkedLists {
	public static Node merge(Node a, Node b, Node result) {
		if(a == null) {
			//result = b;
			return b;
		}
		if(b == null) {
			//result = a;
			return a;
		}
		
		if(a.data<=b.data) {
			result = a;
			result.next=  merge(a.next, b, result.next);
		} else {
			result = b;
			result.next= merge(a, b.next, result.next);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Node a = new Node(1);
		a.next = new Node(2);
		
		Node b = new Node(2);
		b.next  = new Node(4);
		Node result = null;
		result=merge(a, b, result);
		
		while(result != null) {
			System.out.print(result.data+" ");
			result = result.next;
		}
	}
}
