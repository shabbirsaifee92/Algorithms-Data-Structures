
public class ReverseLinkList {

	static class Node {
	     int value;
	     Node next;
	     Node(int value) {
	         this.value = value;
	     }
	 }
	
	public static void main(String[] args) {
		
		ReverseLinkList o =new ReverseLinkList();
		Node n5 = new Node(5);
		Node n4 = new Node(4);
		Node n3 = new Node(3);
		Node n2 = new Node(2);
		Node n1 = new Node(1);
		n5.next=n4;
		n4.next=n3;
		n3.next=n2;
		n2.next=n1;
		n1.next=null;
		Node head = o.reverse(n5);
		while(head!= null){
			System.out.println(head.value);
			head= head.next;
		}
	}
	
	Node reverse(Node head){

		Node next = null;
		Node prev =null;
		while(head!=null){
			
			next = head.next;
			head.next=prev;
			prev = head;
			head = next;
		}
		
		return prev;
	}
}


