
public class NthNodeFromEnd {

	public static class Node
	    {
	        int data;
	        Node next;
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	 
	 public static void main(String[] args) {
		
		 Node n1= new Node(1);
		 Node n2= new Node(2);
		 Node n3= new Node(3);
		 Node n4= new Node(4);
		 Node n5= new Node(5);
		 Node n6= new Node(6);
		 
		 n1.next = n2;
		 n2.next = n3;
		 n3.next = n4;
		 n4.next = n5;
		 n5.next = n6;
		 
		 int n =3;
		 
		 Node node = findNode(n1,n);
		 System.out.println(node.data);
		 
	 }

	private static Node findNode(Node head,int n) {
		
		Node slow = head;
		Node fast = head;
		while(n>1){
			fast= fast.next;
			n--;
		}
		while(fast!=null){
			fast = fast.next;
			slow=slow.next;
		}
		return slow;
	}
}
