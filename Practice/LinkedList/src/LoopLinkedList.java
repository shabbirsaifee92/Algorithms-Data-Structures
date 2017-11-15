

public class LoopLinkedList {

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
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n2;
		
		boolean b = detectLoop(n1);
		System.out.println(b);
		
	}

	private static boolean detectLoop(Node head) {
		
		Node slow = head;
		Node fast = head;
		while(fast!=null & fast.next!=null){
			slow= slow.next;
			fast=fast.next.next;
			if(slow==fast){
				return true;
			}
		}
		return false;
	}
}
