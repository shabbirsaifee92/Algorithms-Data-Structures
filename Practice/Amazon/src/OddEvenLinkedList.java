/*
 * Rearrange linked list so that all even and odd positioned nodes are together
 */
public class OddEvenLinkedList {

	
	public static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
		public int getData(){
			return this.data;
		}
	}
	
	
	public static void main(String[] args) {
		Node n1 = new Node(10);
		Node n2 = new Node(22);
		Node n3 = new Node(30);
		Node n4 = new Node(43);
		Node n5 = new Node(56);
		Node n6 = new Node(70);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=null;
		
		Node n =  (n1);
		
	}


	private static Node newList(Node n1) {
		// TODO Auto-generated method stub
		return null;
	}
}
