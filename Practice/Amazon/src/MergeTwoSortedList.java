/*
 * Merge two sorted linked list
 */
public class MergeTwoSortedList {

	public static class Node{
		
		int data;
		Node next;
		Node(){
			
		}
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next=n3;
		n3.next=n4;
		n2.next=n5;
		
		Node head = merge(n1,n2);
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}

	private static Node merge(Node n1, Node n2) {
		
		// Base condition
		if(n1==null){
			return n2;
		}
		if(n2==null){
			return n1;
		}
		Node result =null;
		if(n1.data<n2.data)
		{
			result = n1;
			result.next = merge(n1.next,n2);
		}else{
			result = n2;
			result.next=merge(n1,n2.next);
		}
		
		return result;
	}
}
