

public class MergeTwoSortedList {
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
		//List 1
		Node n1 = new Node(10);
		Node n2 = new Node(50);
		Node n3 = new Node(70);
		Node n4 = new Node(90);
		Node n5 = new Node(100);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		
		//List 2
		Node m1 = new Node(20);
		Node m2 = new Node(30);
		Node m3 = new Node(40);
		Node m4 = new Node(60);
		Node m5 = new Node(80);
		
		m1.next=m2;
		m2.next=m3;
		m3.next=m4;
		m4.next=m5;
		
		Node head = mergeList(n1,m1);
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}

	private static Node mergeList(Node p, Node q) {
		
		Node s = null;
		Node newHead = null;
		if(p.data<q.data){
			s = p;
			p = s.next;
		}
		else if(q.data<p.data){
			s= q;
			q=s.next;
		}
		newHead = s;
		
		while(p!=null && q!=null){
			if(p.data<q.data){
				s.next = p;
				s = p;
				p = s.next;
			}
			else if(q.data<p.data){
				s.next=q;
				s= q;
				q=s.next;
			}			
		}
		
		if(p==null)
			s.next =q;
		if(q==null)
			s.next=p;
		
		return newHead;
	}
}
