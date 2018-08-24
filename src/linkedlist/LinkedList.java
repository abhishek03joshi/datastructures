package linkedlist;

public class LinkedList {
	
	Node head;//head node of the list
	//inner class is made static so that main can access it
	static class Node{
		
		int data;
		Node next;
		
		//Constructor to create a new node.
		Node(int d){
			data=d;
		}
	}
	
	public static void main(String [] args) {
		//start with an empty linked list
		LinkedList llist = new LinkedList();
		
		llist.head=new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		llist.head.next = second;
		
		second.next = third;
		
	}

}
