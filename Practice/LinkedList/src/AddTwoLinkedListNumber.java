
public class AddTwoLinkedListNumber {

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
	public Node add(Node n1,Node n2){
		Node res=new Node(0);
		int s=0,c=0;
		while(n1!=null && n2!=null){
			 s = n1.data+n2.data+c;
			 c = s>=10? 1:0;
			res.data= s%10;
			res=res.next;
		}
		
		
		return res;
	}
}
