package linkedList;

public class ReverseLinkedList {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	void printList(Node node){
		while(node!=null){
			System.out.println(node.data+" ");
			node = node.next;
		}
	}
	
	Node reverseList(Node node){
		Node current = node;
		Node prev = null;
		Node next = null;
		
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		node = prev;
		return node;
	}
	
	public static void main(String args[]){
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		//head = list.reverseList(head);
		head = list.reverseList(head);
		list.printList(head); 
	}
}
