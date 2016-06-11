package simple;

public class ReverseDoublyLinkedList {

	static void reverse(Node head) {
		Node x = head;
		while(x!= null) {
			Node temp = x.previous;
			x = x.next;
			x.next = temp;
			
			x= x.next;
		}
		
		while(head!=null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	
	
}
