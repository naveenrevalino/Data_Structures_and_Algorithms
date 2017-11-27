package ds.circular_linked_list;

import ds.linked_list_singlylinked_list.Node;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		first=null;
		last=null;		
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if (isEmpty()) {
			newNode.next = first;
			newNode = first;			
		}
		
	}
	
	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()) {
			first = newNode;			
		}
		else {
			last.next = newNode;
			last = newNode;
		}
	}
	
	public int deleteFirst() {
		int temp = first.data;
		if(first.next == null) {
			last=null;
		}
		first = first.next;
		return temp;
	}
	
	public void display() {
		System.out.println("First --------> last");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (first == null);
	}

}
