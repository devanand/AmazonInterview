package simple;


public class ReverseLinkedList {

	static Node reverse(Node head, Node previous, int n) {
		if(head == null || n == 0) {
	        return previous;
	    }
	    Node temp = head;
	    head = head.next;
	    if(head!=null) {
	        
	        Node temp1 = head.next;
	        head.next = temp;
	        temp.next = previous;
	        return reverse(temp1, head, n-1);
	    }
	    else {
	        temp.next = previous;
	        return reverse(null, temp, n-1);    
	    }
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		
		Node result = reverse(head, null, 2);
		
		for(Node n = result;n!= null;n=n.next) {
			System.out.print(n.data);
		}
	}
}
