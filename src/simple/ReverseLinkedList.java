package simple;


public class ReverseLinkedList {

	static Node reverse(Node head, Node previous) {
		if(head == null) {
	        return previous;
	    }
	    Node temp = head;
	    head = head.next;
	    if(head!=null) {
	        
	        Node temp1 = head.next;
	        head.next = temp;
	        temp.next = previous;
	        return reverse(temp1, head);
	    }
	    else {
	        temp.next = previous;
	        return reverse(null, temp);    
	    }
	}
}
