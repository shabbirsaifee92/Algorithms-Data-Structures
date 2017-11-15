/*
 * check if list is palindrome
 */
public class PalindromeList {
	
	static class Node{
		
		char data;
		Node next;
		Node(){
			
		}
		Node(char c ){
			data = c;
		}
	}

	public static void main(String[] args) {
				
		Node n1 = new Node('a');
		Node n2 = new Node('b');
		Node n3 = new Node('b');
		Node n4 = new Node('a');
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		System.out.println(isPalindrome(n1));
		
	}
	
	static	boolean  isPalindrome(Node root){
		
		Node slow=root;
		Node fast=root.next.next;
		while(fast!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		//Reverse the half of the list
		Node prev =slow;
		Node half =slow;
		while(slow!=null){
			
			Node n = slow.next;
			slow.next=prev;
			prev=slow;
			slow=n;
		}
		
		//from root to half == half to end
		while(half!=null){
			if(half.data!=root.data)
				return false;
			root=root.next;
			half=half.next;
		}
		
		return true;
		
	}
}
